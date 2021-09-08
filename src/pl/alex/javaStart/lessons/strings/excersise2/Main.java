package pl.alex.javaStart.lessons.strings.excersise2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String text = readTextFromUser();
        checkFirstLetter(text);
    }

    private static void checkFirstLetter(String text) {
        //get 1st letter
        char first = text.charAt(0);
        // check 1st letter
        if (Character.isAlphabetic(first)) {
            if (Character.isUpperCase(first)) {
                System.out.println(text.toUpperCase());
            } else if (Character.isLowerCase(first)) {
                System.out.println(text.toLowerCase());
            }
        } else {
            System.out.println(text);
        }
    }
    private static String readTextFromUser() {
        System.out.println("Podaj text");
        return scanner.nextLine();
    }

}
