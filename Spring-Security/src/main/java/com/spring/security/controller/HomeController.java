package com.spring.security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String Home(HttpServletRequest request){
        return "Welcom To Spring Security: "+ request.getSession().getId();
    }

}
