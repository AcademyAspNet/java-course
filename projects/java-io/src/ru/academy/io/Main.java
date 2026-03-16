package ru.academy.io;

import java.io.File;
import java.io.IOException;

public class Main {

    static void main() {
        // Относительный путь / Relative Path
        // Абсолютный путь / Absolute Path

        // C:\Users\Academy\Desktop\Test\Hello.txt
        // /usr/Academy/home/Test/Hello.txt

        // ...
        // \Desktop\Test\Hello.txt

        System.out.println("File.separator: " + File.separator);

        String textFilePath = "C:" + File.separator +
                "Users" + File.separator +
                "Academy" + File.separator +
                "Desktop" + File.separator +
                "Test" + File.separator +
                "Hello.txt";

        File textFile = new File(textFilePath);

        System.out.println("Текстовый файл: " + textFile);

        System.out.println("Существует ли объект в файловой системе? " + textFile.exists());
        System.out.println("Путь указывает на директорию? " + textFile.isDirectory());
        System.out.println("Путь указывает на файл? " + textFile.isFile());

        createPlainFile("Abc\\123\\Hello\\World.txt");
    }

    static void createPlainFile(String filePath) {
        File plainFile = new File(filePath);
        System.out.println("Нужно создать новый пустой файл: " + plainFile);

        File parentDirectory = plainFile.getParentFile();
        System.out.println("Новый пустой файл должен находиться в директории: " + parentDirectory);

        if (!parentDirectory.exists()) {
            boolean isCreated = parentDirectory.mkdirs();

            if (isCreated)
                System.out.println("Создали новую директорию: " + parentDirectory);
            else
                System.out.println("Не удалось создать новую директорию!");
        }

        if (plainFile.exists()) {
            System.out.println("Файл по этому пути уже существует!");
            return;
        }

        try {
            boolean isCreated = plainFile.createNewFile();

            if (isCreated)
                System.out.println("Новый пустой файл был успешно создан!");
            else
                System.out.println("Файл уже существует!");
        } catch (IOException exception) {
            System.out.println("Не удалось создать файл! " + exception.getMessage());
        }
    }
}
