package com.example.calculator.Service;
import org.springframework.stereotype.Service;
import java.util.Objects;
@Service
public class CalculatorService {
    private int a, b;
    private String method;
    public CalculatorService(int a, int b, String method) {
        this.a = a;
        this.b = b;
        this.method = method;
    }
    public String answer(){
        if(Objects.equals(method, "+")){
            return "ответ: " + (a + b);
        }
        else if (Objects.equals(method, "*")) {
            return "ответ: " + (a * b);
        }
        else if (Objects.equals(method, "/")) {
            if (b == 0) {
                return "ошибка";
            }
            else {
                return "ответ: " + (a / b);
            }
        }
        return "ошибка";
    }

}
