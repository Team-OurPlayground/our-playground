package com.dong.ourplayground.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class BaseController {

    @GetMapping("/")
    public String baseUrl() {
        return "redirect:/swagger-ui/index.html";
    }
}
