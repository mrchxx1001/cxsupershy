package com.project.cxsupershy.controller.users;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class UserDataController {
    @PostMapping("/save-nickname")
    public ResponseEntity<String> saveNickname(@RequestParam(name = "username") String username) {
        // value 값을 저장
        return ResponseEntity.ok("저장 완료");
    }

    @PostMapping("/save-icon")
    public ResponseEntity<String> saveIcon(@RequestParam(name = "path") String path) {
        // 아이콘 url을 받아 저장
        return ResponseEntity.ok("저장 완료");
    }

    @PostMapping("/save-mode")
    public ResponseEntity<String> saveMode(@RequestParam(name = "modeName") String modeName) {
        // value 값을 저장
        return ResponseEntity.ok("저장 완료");
    }

    @PostMapping("/save-seat")
    public ResponseEntity<String> saveSeat(@RequestParam(name = "seatAngle") int seatAngle,
                                           @RequestParam(name = "seatPosition") int seatPosition) {
        // 의자 앵글(위아래) : 숫자로 저장
        // 의자 위치(앞뒤) : 숫자로 저장
        // json으로 매핑{angle : 10, position : 10} -> service에 전달
        return ResponseEntity.ok("저장 완료");
    }

    @PostMapping("/save-mirror")
    public ResponseEntity<String> saveMirror() {
        // 해시맵으로 만들어 저장
//        @RequestParam(name = "leftMirror") int leftMirror,
//        @RequestParam(name = "roomMirror") int roomMirror,
//        @RequestParam(name = "rightMirror") int rightMirror

        // 일단 임의의 값 설정
        int leftMirror = 10;
        int roomMirror = 10;
        int rightMirror = 10;
        return ResponseEntity.ok("저장 완료");
    }

    @PostMapping("/save-humid")
    public ResponseEntity<String> saveHumid(@RequestParam(name = "humid") int humid) {
        // value값을 저장
        return ResponseEntity.ok("저장 완료");
    }

    @PostMapping("/save-face-embedding")
    public ResponseEntity<String> saveFaceEmbedding() {
        // json으로 넘겨받아야 함
        // cameraController 참고
        String embedding = "12345";
        return ResponseEntity.ok("저장 완료");
    }
}
