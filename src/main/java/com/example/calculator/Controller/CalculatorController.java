package com.example.calculator.Controller;
import com.example.calculator.Service.CalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String calculate(Model model){
        model.addAttribute("Calculator", "");
        return "main";
    }
    @PostMapping("/")
    public String calculate(@RequestParam int a, @RequestParam int b, @RequestParam String method, Model model) {
        CalculatorService cs = new CalculatorService(a, b, method);
        model.addAttribute("Calculator", cs.answer());
        return "main";
    }
}
