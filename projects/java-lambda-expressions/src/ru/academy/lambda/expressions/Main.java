package ru.academy.lambda.expressions;

import ru.academy.anonymous.classes.Handler;

import java.util.Random;
import java.util.function.*;

public class Main {

    static void main() {
        handleInformation(
                (information) -> System.out.println("Обработчик >> " + information));

        Predicate<String> predicate = (text) -> text != null && text.length() > 3;

        System.out.println(predicate.test("Привет!"));
        System.out.println(predicate.test("Абвг"));
        System.out.println(predicate.test("123"));
        System.out.println(predicate.test(""));
        System.out.println(predicate.test(null));

        Function<String, Integer> function = (text) -> {
            if (text == null)
                return -1;

            return text.hashCode();
        };

        System.out.println(function.apply("Привет!"));
        System.out.println(function.apply("Абвг"));
        System.out.println(function.apply("123"));
        System.out.println(function.apply(""));
        System.out.println(function.apply(null));

        Supplier<Integer> randomNumber = () -> new Random().nextInt();

        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());

        // Function<Integer, Integer>
        UnaryOperator<Integer> toPositive = (number) -> Math.abs(number);
    }

    static void handleInformation(Consumer<String> consumer) {
        String information = "Сообщение из очереди сообщений...";
        consumer.accept(information);
    }
}
