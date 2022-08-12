package com.example.calculator.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    @Test
    void AdditionTest() {
    Calculation c = new Calculation(5, 5, "+");
    assertEquals("ответ: " + 10, c.Ans());
    }
    @Test
    void MultiplicationTest() {
        Calculation c = new Calculation(5, 5, "*");
        assertEquals("ответ: " + 25, c.Ans());
    }
    @Test
    void DivideTest() {
        Calculation c = new Calculation(25, 5, "/");
        assertEquals("ответ: " + 5, c.Ans());
    }
    @Test
    void DivideIf_ZeroTest() {
        Calculation c = new Calculation(25, 0, "/");
        assertEquals("Ошибка", c.Ans());
    }
}