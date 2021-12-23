package com.project.netflix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @GetMapping("/base/base")
    public String index(){
        return "/base/base.html";
    }

}
