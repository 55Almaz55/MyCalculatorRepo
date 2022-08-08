package com.example.calculator.Controller;

import com.example.calculator.Service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    @Test
    void AdditionTest() {
    CalculatorService cs = new CalculatorService(5, 5, "+");
    assertEquals("ответ: " + 10, cs.answer());
    }
    @Test
    void MultiplicationTest() {
        CalculatorService cs = new CalculatorService(5, 5, "*");
        assertEquals("ответ: " + 25, cs.answer());
    }
    @Test
    void DivideTest() {
        CalculatorService cs = new CalculatorService(25, 5, "/");
        assertEquals("ответ: " + 5, cs.answer());
    }
    @Test
    void DivideIf_ZeroTest() {
        CalculatorService cs = new CalculatorService(25, 0, "/");
        assertEquals("Ошибка", cs.answer());
    }
}