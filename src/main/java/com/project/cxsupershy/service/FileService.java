package com.project.cxsupershy.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class FileService {
    public Map<String, Object> jsonReader(String path) {
        try {
            // ObjectMapper 객체 생성
            ObjectMapper objectMapper = new ObjectMapper();

            // JSON 파일을 읽고 Map으로 변환
            File file = new File(path);

            // JSON을 Map 형태로 읽어들임 (또는 사용할 클래스에 맞게 변경 가능)
            Map<String, Object> jsonData = objectMapper.readValue(file, Map.class);

            System.out.println(jsonData);

            // JSON에서 필요한 데이터 추출
            List<List<Double>> embedding = (List<List<Double>>) jsonData.get("embeddings");
            List<String> name = (List<String>) jsonData.get("names");

            // 출력
            System.out.println(embedding);  // 1
            System.out.println(name);  // 1000

            return jsonData;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
