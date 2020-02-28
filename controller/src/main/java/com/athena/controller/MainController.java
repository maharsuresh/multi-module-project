package com.athena.controller;

import org.springframework.stereotype.Controller;


@Controller
public class MainController {
    public String hello() {
        return "Hello Controller";
    }

}