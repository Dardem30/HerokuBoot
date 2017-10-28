package com.herokuexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Роман on 28.10.2017.
 */
@Controller
public class MainController {
    @GetMapping(value = "/")
    public String main(){
        return "index";
    }
}
