package ru.academy.jcf;

public class Main {

    static void main() {
        String integerAsString = IO.readln("Введите целое число: ");
        int integerAsInt = Integer.parseInt(integerAsString);

        System.out.println("Квадрат числа: " + integerAsInt * integerAsInt);

        String firstName = IO.readln("Укажите Ваше имя: ");
        String lastName = IO.readln("Укажите Вашу фамилию: ");

        System.out.println("Приятно познакомиться, " + firstName + " " + lastName + "!");
    }
}
