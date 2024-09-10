package com.project.cxsupershy.controller.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserViewController {

    @GetMapping("/")
    public String first(){
        return "firstView";
    }

    @GetMapping("/go-nickname")
    public String goNickname(){
        return "nickname";
    }

    @GetMapping("/go-icon")
    public String goIcon() {
        return "icon";
    }

    @GetMapping("/go-mode")
    public String goMode() {
        return "mode";
    }

    @GetMapping("/go-seat")
    public String goSeat() {
        return "seat";
    }

    @GetMapping("/go-mirror")
    public String goMirror() {
        return "mirror";
    }

    @GetMapping("/go-temperature")
    public String goTemperature() {
        return "temperature";
    }

    @GetMapping("/go-humidity")
    public String goHumidity() {
        return "humidity";
    }

    @GetMapping("/go-face")
    public String goFace() {
        return "face";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "createProfileFinish";
    }

    @GetMapping("/main")
    public String main(){
        return "main";
    }
}
