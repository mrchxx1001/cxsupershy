package com.project.cxsupershy.controller.camera;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FlaskController {
    @GetMapping("/show-flask-page")
    public String showFlaskPage() {
        // 이 메서드는 templates 폴더에 있는 "flaskPage.html"을 렌더링
        return "flaskPage";
    }
}
