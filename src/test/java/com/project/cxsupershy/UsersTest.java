package com.project.cxsupershy;

import com.project.cxsupershy.service.UserService;
import org.junit.jupiter.api.Test;

public class UsersTest {
    @Test
    public void 유저서비스테스트() {
        UserService userService = new UserService();
        userService.saveUser();
    }

}
