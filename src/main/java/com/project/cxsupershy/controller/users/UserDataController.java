package com.project.cxsupershy.controller.users;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.cxsupershy.service.FileService;
import com.project.cxsupershy.service.UserService;
import jakarta.persistence.Access;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserDataController {
    @Autowired
    FileService fileService;

    @Autowired
    UserService userService;

    @PostMapping("/save-nickname")
    public ResponseEntity<String> saveNickname(@RequestParam(name = "username") String username,
                                               HttpSession session) {

        // value를 session에 값을 저장
        session.setAttribute("username", username);
        return ResponseEntity.ok("닉네임 세션 저장 완료");
    }

    @PostMapping("/save-icon")
    public ResponseEntity<String> saveIcon(@RequestParam(name = "path") String path,
                                           HttpSession session) {
        // 아이콘 url을 session에 저장
        session.setAttribute("icon", path);
        return ResponseEntity.ok("아이콘 세션 저장 완료");
    }

    @PostMapping("/save-mode")
    public ResponseEntity<String> saveMode(@RequestParam(name = "modeName") String modeName,
                                           HttpSession session) {
        // value 값을 session에 저장
        session.setAttribute("display", modeName);
        return ResponseEntity.ok("모드 저장 완료");
    }

    @PostMapping("/save-seat")
    public ResponseEntity<String> saveSeat(@RequestParam(name = "seatAngle") int seatAngle,
                                           @RequestParam(name = "seatPosition") int seatPosition,
                                           HttpSession session) throws JsonProcessingException {


        // angle(기울기), 포지션(앞, 뒤) map으로 저장
        Map<String, Object> data = Map.of(
                "angle", seatAngle,
                "position", seatPosition
        );

        // map을 json 형태의 string으로 변환 (fileService)
        // {angle : 10, position : 10}
        String dataToJson = fileService.mapToJson(data);

        // session에 저장
        session.setAttribute("seatPosition", dataToJson);
        return ResponseEntity.ok("좌석 세션 저장 완료");
    }

    @PostMapping("/save-mirror")
    public ResponseEntity<String> saveMirror(@RequestParam(name = "leftMirror") int leftMirror,
                                             @RequestParam(name = "roomMirror") int roomMirror,
                                             @RequestParam(name = "rightMirror") int rightMirror,
                                             HttpSession session) {

        // leftMirror, rightMirror, bachMirror map으로 변환
        Map<String, Object> dataSide = Map.of("leftMirror", leftMirror, "rightMirror", rightMirror);
        Map<String, Object> dataBack = Map.of("backMirror", roomMirror);

        // map을 json 형태의 String으로 변환 (fileService)
        String mirrorSide = fileService.mapToJson(dataSide);
        String mirrorBack = fileService.mapToJson(dataBack);

        // session에 저장
        session.setAttribute("mirrorAngleSide", mirrorSide);
        session.setAttribute("mirrorAngleBack", mirrorBack);

        return ResponseEntity.ok("거울 세선 저장 완료");
    }

    // flask에서 받은 데이터 처리
    @PostMapping("/receive-json")
    public ResponseEntity<String> receiveData(@RequestBody Map<String, Object> data,
                                              HttpSession session) {
        // data에서 embeddings와 log_data를 추출
        Object embeddings = data.get("embeddings");
        Object logData = data.get("log_data");

        // log_data에서 'New person detected' 데이터 뽑기 (service)
        String newUser = fileService.catchNewPerson(logData);

        // embeddings를 person=embedding 형태의 map으로 변환 (service)
        Map<String, Object> userEmbeddingMapping = fileService.userEmbeddingMapping(embeddings);

        // 그 person의 embedding 값을 찾아냄 -> userEmbeddingMapping.get(newUser);

        // 이것도 세션에 담기
        // 세션 통으로 저장 (service)
        userService.saveSession(session);
        return ResponseEntity.ok("데이터를 성공적으로 받았습니다.");
    }
}
