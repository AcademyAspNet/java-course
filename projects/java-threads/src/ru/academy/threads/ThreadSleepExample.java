package ru.academy.threads;

public class ThreadSleepExample {

    static void main() {
        Thread myThread = new Thread(() -> {
            System.out.println("Привет!");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException exception) {
                System.out.println("Поток прерван! " + exception.getMessage());
            }

            System.out.println("Пока!");
        });

        myThread.start();
    }
}
