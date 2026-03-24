package ru.academy.java.tdd;

public class Main {

    static void main() {
        double value = new Calculator().divide(3, 0);
        System.out.println(value);
    }
}
