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

    public Map<String, Object> getFirstLogToList(List<String> logData) {
        String firstLog = logData.get(0);
        String[] parts = firstLog.split(": ");
        Map<String, Object> result = new HashMap<>();

        if (parts[0].equals("New person detected")) {
            result.put("isNewPerson", true);
            result.put("userId", parts[1]);
        } else if (parts[0].equals("Login")) {
            result.put("isNewPerson", false);
            result.put("userId", parts[1]);
        }

        System.out.println(result);
        return result;
    }
}
