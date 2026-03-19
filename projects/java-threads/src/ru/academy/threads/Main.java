package ru.academy.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    static void main() {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread thread = Thread.currentThread();
        System.out.println("Текущий поток: " + thread);

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt();
            numbers.add(randomNumber);
        }

        int maxNumber = numbers.get(0);

        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("Максимальное число: " + maxNumber);
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("Текущий поток: " + thread);

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt();
            numbers.add(randomNumber);
        }

        int minNumber = numbers.get(0);

        for (int number : numbers) {
            if (number < minNumber) {
                minNumber = number;
            }
        }

        System.out.println("Минимальное число: " + minNumber);
    }
}
