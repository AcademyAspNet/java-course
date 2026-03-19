package ru.academy.threads;

public class CreateThreadExample {

    static void main() {
        CustomThread customThread = new CustomThread();

        Thread firstThread = new Thread(customThread);
        firstThread.start();

        Thread secondThread = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread currentThread = Thread.currentThread();
                System.out.println("Второй поток: " + currentThread);
            }
        });

        secondThread.start();

        Thread thirdThread = new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            System.out.println("Третий поток: " + currentThread);
        });

        thirdThread.start();

        Thread currentThread = Thread.currentThread();
        System.out.println("Основной поток: " + currentThread);
    }
}

class CustomThread implements Runnable {

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println("Первый поток: " + currentThread);
    }
}
