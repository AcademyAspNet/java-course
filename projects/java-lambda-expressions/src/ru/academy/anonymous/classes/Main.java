package ru.academy.anonymous.classes;

public class Main {

    static void main() {
        handleInformation(new Handler() {
            @Override
            public void handle(String information) {
                System.out.println("Обработчик >> " + information);
            }
        });
    }

    static void handleInformation(Handler handler) {
        String information = "Сообщение из очереди сообщений...";
        handler.handle(information);
    }
}
