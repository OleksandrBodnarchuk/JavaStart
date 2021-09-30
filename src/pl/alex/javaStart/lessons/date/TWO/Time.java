package pl.alex.javaStart.lessons.date.TWO;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Time {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LocalDate date1 = getDate();
        LocalDate date2 = getDate();
        getLatestDate(date1, date2);
        getDateDifference(date1,date2);
    }

    private static void getDateDifference(LocalDate date1, LocalDate date2) {
        Period period = Period.between(date1,date2);
        long years = Math.abs(period.getYears());
        long months = Math.abs(period.getMonths());
        long days = Math.abs(period.getDays());
        System.out.printf("Podane daty dzieli %d lat, %d miesięcy i %d dni",years,months,days);
    }

    private static void getLatestDate(LocalDate date1, LocalDate date2) {
        LocalDate res = date1.isAfter(date2)?date1:date2;
        System.out.println("Późniejsza data " + res);
    }

    private static LocalDate getDate() {
        System.out.println("Podaj dzień miesiąca");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj miesiąc");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj rok");
        int year = scanner.nextInt();
        scanner.nextLine();
        return LocalDate.of(year,month,day);
    }
}
