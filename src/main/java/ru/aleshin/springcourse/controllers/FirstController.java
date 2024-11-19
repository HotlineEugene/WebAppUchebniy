package ru.aleshin.springcourse.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {
        //System.out.println("Hello, " + name + " " + surname + "!");
        model.addAttribute("message", "Hello, " + name + " " + surname + "!");
        return "first/hello";
    }
    @GetMapping("/businka")
    public String goodbyePage() {
        return "first/skulit";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam(value = "a", required = false) Double a,
                             @RequestParam(value = "b", required = false) Double b,
                             @RequestParam(value = "action", required = false) String action,
                             Model model) {
        Double result;
        switch (action) {
            case "multiplication":
                result = a * b;
                break;
            case "division":
                result =  a / b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case "addition":
                result = a + b;
                break;
            default:
                result = null;
        }
        model.addAttribute("result",  result);
        return "first/calculator";
    }
}
