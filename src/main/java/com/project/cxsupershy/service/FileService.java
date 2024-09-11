package com.project.cxsupershy.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.project.cxsupershy.domain.Users;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.*;

@Service
public class FileService {

    public String mapToJson(Map<String, Object> data) {
        ObjectMapper objectMapper = new ObjectMapper();

        String dataToJson = null;
        try {
            dataToJson = objectMapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
        return dataToJson;
    }

    public Map<String, Object> jsonToMap(String json) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        // JSON 문자열을 Map으로 변환
        return objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {});
    }

    public String catchNewPerson(Object logData) {

        return "결과";
    }

    public Map<String, Object> userEmbeddingMapping(Object embeddings) {
        Map<String, Object> newMap = Map.of("test1",1, "test2",2);
        return newMap;
    }

}
