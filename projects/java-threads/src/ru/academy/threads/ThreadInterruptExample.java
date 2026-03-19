package ru.academy.threads;

public class ThreadInterruptExample {

    static void main() {
        Thread myThread = new Thread(() -> {
            Thread thread = Thread.currentThread();

            while (!thread.isInterrupted()) {
                System.out.print('.');
            }
        });

        myThread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.print('_');
        }

        myThread.interrupt();
    }
}
