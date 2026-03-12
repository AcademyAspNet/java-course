package ru.academy.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    static void main() {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate todayPlusYear = today.plusYears(1);
        System.out.println(todayPlusYear);

        LocalDate todayPlus45Days = today.plusDays(45);
        System.out.println(todayPlus45Days);

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime nowPlus8Hours = now.plusHours(8);
        System.out.println(nowPlus8Hours);

        LocalDateTime todayAndNow = LocalDateTime.now();
        System.out.println(todayAndNow);

        LocalDate parsedDate = LocalDate.parse("2026-01-01");
        System.out.println(parsedDate);

        LocalDate date = LocalDate.of(2026, 1, 1);
        System.out.println(date);

        LocalDate firstDate = LocalDate.now().minusDays(1);
        System.out.println(firstDate);

        LocalDate secondDate = firstDate.minusDays(3);
        System.out.println(secondDate);

        boolean isBefore = firstDate.isBefore(secondDate);
        System.out.println(isBefore);

        boolean isAfter = firstDate.isAfter(secondDate);
        System.out.println(isAfter);
    }
}
