package org.example.hellogithubactionsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }


}
