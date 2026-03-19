package ru.academy.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    static void main() {
        try (ExecutorService executorService = Executors.newFixedThreadPool(16)) {
            for (int i = 0; i < 32; i++) {
                int taskId = i + 1;
                Runnable task = () -> {
                    System.out.println("Задача #" + taskId);
                    System.out.println("Текущий поток: " + Thread.currentThread());
                };

                executorService.execute(task);
            }
        }
    }
}
