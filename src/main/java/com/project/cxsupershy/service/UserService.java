package com.project.cxsupershy.service;

import com.project.cxsupershy.domain.Users;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService {
    public String saveUser() {
        // 저장 로직
        return "저장성공";
    }

    public Users saveSession(HttpSession Session) {
        Users user = new Users();
        return user;
    }
}
