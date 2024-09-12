package com.project.cxsupershy.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainViewController {

    // 대시보드 제작 중
    @GetMapping("/dashboard")
    public String dashboard(){
        return "/main/dashboard";
    }

    @GetMapping("/into-rest-mode")
    public String intoRestMode(){
        return "/main/into-rest-mode";
    }

    @GetMapping("/rest-mode")
    public String restMode(){
        return "/main/rest-mode";
    }

    @GetMapping("/switch-profile")
    public String switchProfile(){ return "/main/switch-profile"; }

    @GetMapping("/kakao_map")
    public String kakaoMap(){ return "/main/kakao_map"; }

}
