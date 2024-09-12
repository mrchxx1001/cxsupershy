package com.project.cxsupershy.controller.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;


@Controller
public class UserViewController {

    @GetMapping("/")
    public String first(){
        return "/register/intro";
    }

    @GetMapping("/set-nickname")
    public String setNickname(){
        return "/register/set-nickname";
    }

    @GetMapping("/select-profile-icon")
    public String selectProfileIcon() {
        return "/register/select-profile-icon";
    }

    @GetMapping("/custom-mode")
    public String customMode() {
        return "/register/custom-mode";
    }

    @GetMapping("/custom-seat")
    public String customSeat() {
        return "/register/custom-seat";
    }

    // 제작 중
    @GetMapping("/custom-mirror")
    public String customMirror() {
        return "/register/custom-mirror";
    }

    @GetMapping("/custom-temperature")
    public String customTemperature() {
        return "/register/custom-temperature";
    }

    @GetMapping("/custom-humid")
    public String customHumidity() {
        return "/register/custom-humid";
    }

    // 플라스크 적용
    @GetMapping("/show-flask-page")
    public String showFlaskPage() {
        // 이 메서드는 templates 폴더에 있는 "flaskPage.html"을 렌더링
        return "/register/flaskPage";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "/register/register-finish";
    }


}
