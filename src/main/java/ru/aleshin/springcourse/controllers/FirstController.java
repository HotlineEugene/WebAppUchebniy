package ru.aleshin.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    @GetMapping("/hello")
    public String helloPage() {
        return "first/hello";
    }
    @GetMapping("/businka")
    public String goodbyePage() {
        return "first/skulit";
    }
}
