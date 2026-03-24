package ru.academy.java.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тесты калькулятора")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @DisplayName("Тест сложения")
    @Test
    void testAdd() {
        int firstNumber = 2;
        int secondNumber = 3;

        int result = calculator.add(firstNumber, secondNumber);

        assertEquals(5, result);
    }

    @Test
    void testIsEvenForIntegers() {
        int number = 4;
        boolean isEven = calculator.isEven(number);

        assertTrue(isEven);
    }

    @Test
    void testIsEvenForReal() {
        double number = 4;
        boolean isEven = calculator.isEven(number);

        assertTrue(isEven);
    }

    @Test
    void testDivide() {
        double firstNumber = 3;
        double secondNumber = 2;

        double result = calculator.divide(firstNumber, secondNumber);

        assertEquals(1.5, result);
    }

    @Test
    void testDivideByZero() {
        double firstNumber = 3;
        double secondNumber = 0;

        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(firstNumber, secondNumber)
        );
    }
}
