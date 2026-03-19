package ru.academy.threads;

public class Dots {

    static void main() {
        System.out.println(Thread.currentThread());

        AnotherThread anotherThread = new AnotherThread();
        anotherThread.setDaemon(true);
        anotherThread.setPriority(Thread.MAX_PRIORITY);
        anotherThread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.print('.');
        }
    }
}

class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread());

        while (true) {
            System.out.print('_');
        }
    }
}
