package ru.academy.java.tdd;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(long number) {
        return number % 2 == 0;
    }

    public boolean isEven(double number) {
        return number % 2 == 0;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }

        return a / b;
    }
}
