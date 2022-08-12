package com.example.calculator.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator_Controller {

    @GetMapping("/")
    public String Calculator(Model model){
        model.addAttribute("Calculation", "");
        return "main";
    }
    @PostMapping("/")
    public String Calculator(@RequestParam int a, @RequestParam int b, @RequestParam String method, Model model) {
        Calculation calculation = new Calculation(a, b, method);
        model.addAttribute("Calculation", calculation.Ans());
        return "main";
    }
}
