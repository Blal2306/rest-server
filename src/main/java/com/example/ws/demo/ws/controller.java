package com.example.ws.demo.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller{
    
    @ResponseBody
    @RequestMapping("/test")
    public String demo(){
        return "ALLAH IS GREAT!";
    }
}
