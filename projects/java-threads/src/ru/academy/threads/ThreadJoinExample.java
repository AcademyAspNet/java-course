package ru.academy.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadJoinExample {

    static void main() {
        Thread minNumberTask = new Thread(() -> {
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
        });

        Thread maxNumberTask = new Thread(() -> {
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
        });

        minNumberTask.start();
        maxNumberTask.start();

        try {
            minNumberTask.join(3000);
            maxNumberTask.join();
        } catch (InterruptedException exception) {
            System.out.println("Поток прерван! " + exception.getMessage());
        }

        System.out.println("Все задачи выполнены!");
    }
}
