package com.project.cxsupershy.controller.receiver;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.util.Map;

@RestController
public class JsonReceiverController {

    @PostMapping("/receive-json")
    public ResponseEntity<String> receiveJsonData(@RequestBody Map<String, Object> data) {
        // embeddings와 log_data를 받아서 처리합니다.
        Map<String, Object> embeddings = (Map<String, Object>) data.get("embeddings");
        Map<String, Object> logData = (Map<String, Object>) data.get("log_data");

        // 데이터 처리 (필요한 로직 추가)
        System.out.println("Received embeddings: " + embeddings);
        System.out.println("Received log_data: " + logData);

        // 이후 다음 페이지로 이동 로직을 처리할 수 있습니다.
        return ResponseEntity.ok("데이터 수신 완료");
    }
}