package com.project.cxsupershy.controller.camera;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/start-camera")
public class CameraController {

    @GetMapping
    public String startCameraStream() {
        // 카메라 스트리밍을 시작하는 Flask URL 호출
        String flaskUrl = "http://192.168.0.80:5000/face-con";
        // 이 URL을 사용자 브라우저에 리디렉션 (Flask 스트리밍 페이지 열기)
        return "redirect:" + flaskUrl;
    }
}
