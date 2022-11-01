package com.example.aman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class controller {

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "just for testing";
    }
}