package com.project.cxsupershy.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService {
    public String saveUser(HashMap<String, Object> map) {

        return "저장성공";
    }
}
