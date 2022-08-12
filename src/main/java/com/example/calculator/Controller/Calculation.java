package com.example.calculator.Controller;

import java.util.Objects;

public class Calculation {
    private int a, b;
    private String method , answer;

    public Calculation(int a, int b, String method) {
        this.a = a;
        this.b = b;
        this.method = method;
    }

    public String Ans(){
        if(Objects.equals(method, "+")){
            return "ответ: " + (a + b);
        }
        else if (Objects.equals(method, "*")) {
            return "ответ: " + (a * b);
        }
        else if (Objects.equals(method, "/")) {
            if (b == 0) {
                return "Ошибка";
            }
            else {
                return "ответ: " + (a / b);
            }
        }
        return "Ошибка";
    }

}
