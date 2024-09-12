package com.project.cxsupershy.controller.users;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.cxsupershy.domain.Users;
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
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")  // 공통 경로 지정
public class UserDataController {
    @Autowired
    FileService fileService;

    @Autowired
    UserService userService;

    @PostMapping("/nickname")
    public ResponseEntity<String> saveNickname(@RequestParam(name = "username") String username,
                                               HttpSession session) {
        session.setAttribute("username", username);
        return ResponseEntity.ok("닉네임 세션 저장 완료");
    }

    @PostMapping("/icon")
    public ResponseEntity<String> saveIcon(@RequestParam(name = "path") String path,
                                           HttpSession session) {
        session.setAttribute("icon", path);
        return ResponseEntity.ok("아이콘 세션 저장 완료");
    }

    @PostMapping("/mode")
    public ResponseEntity<String> saveMode(@RequestParam(name = "modeName") String modeName,
                                           HttpSession session) {
        session.setAttribute("display", modeName);
        return ResponseEntity.ok("모드 저장 완료");
    }

    @PostMapping("/seat")
    public ResponseEntity<String> saveSeat(@RequestParam(name = "seatAngle") int seatAngle,
                                           @RequestParam(name = "seatPosition") int seatPosition,
                                           HttpSession session) throws JsonProcessingException {
        Map<String, Object> data = Map.of("angle", seatAngle, "position", seatPosition);
        String dataToJson = fileService.mapToJson(data);
        session.setAttribute("seatPosition", dataToJson);
        return ResponseEntity.ok("좌석 세션 저장 완료");
    }

    @PostMapping("/mirror")
    public ResponseEntity<String> saveMirror(@RequestParam(name = "leftMirror") int leftMirror,
                                             @RequestParam(name = "roomMirror") int roomMirror,
                                             @RequestParam(name = "rightMirror") int rightMirror,
                                             HttpSession session) {
        Map<String, Object> dataSide = Map.of("leftMirror", leftMirror, "rightMirror", rightMirror);
        Map<String, Object> dataBack = Map.of("backMirror", roomMirror);
        String mirrorSide = fileService.mapToJson(dataSide);
        String mirrorBack = fileService.mapToJson(dataBack);
        session.setAttribute("mirrorAngleSide", mirrorSide);
        session.setAttribute("mirrorAngleBack", mirrorBack);
        return ResponseEntity.ok("거울 세션 저장 완료");
    }

    @PostMapping("/receive-json")
    public ResponseEntity<String> receiveData(@RequestBody Map<String, Object> data,
                              HttpSession session) {

        // embeddings과 logData 추출
        Object embeddings = data.get("embeddings");
        List<String> logData = (List<String>) data.get("log_data");

        // 일단 데이터 확인
        System.out.println("Received embeddings: " + embeddings);
        System.out.println("Received log_data: " + logData);

        return ResponseEntity.ok("거울 세션 저장 완료");
    }
}
