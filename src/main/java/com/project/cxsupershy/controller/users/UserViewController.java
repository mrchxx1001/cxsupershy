package com.project.cxsupershy.controller.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserViewController {

    @GetMapping("/")
    public String first(){
        return "/register/intro";
    }

    // css 경로 선택
    @GetMapping("/set-nickname")
    public String setNickname(){
        return "set-nickname";
    }

    // 폰트 경로 다시 바꾸기
    @GetMapping("/select-profile-icon")
    public String selectProfileIcon() {
        return "select-profile-icon";
    }

    // 배경색이 적용이 안되어있음
    @GetMapping("/custom-mode")
    public String customMode() {
        return "custom-mode";
    }

    // css, 이미지
    @GetMapping("/custom-seat")
    public String customSeat() {
        return "custom-seat";
    }

    // 제작 중
    @GetMapping("/custom-mirror")
    public String customMirror() {
        return "custom-mirror";
    }

    // css, 이미지
    @GetMapping("/custom-temperature")
    public String customTemperature() {
        return "custom-temperature";
    }


    // css, 이미지
    @GetMapping("/custom-humid")
    public String customHumidity() {
        return "custom-humid";
    }

    // 플라스크 적용
    @GetMapping("/show-flask-page")
    public String showFlaskPage() {
        // 이 메서드는 templates 폴더에 있는 "flaskPage.html"을 렌더링
        return "flaskPage";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "register-finish";
    }

    // 대시보드 제작 중
    @GetMapping("/main")
    public String main(){
        return "main";
    }
}
