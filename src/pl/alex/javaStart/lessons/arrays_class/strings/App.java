package pl.alex.javaStart.lessons.arrays_class.strings;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input 1st word: ");
        String one = getStringFromUser().toLowerCase();
        System.out.println("Input 2nd word: ");
        String second = getStringFromUser().toLowerCase();
        System.out.println(compareStrings(one, second));
    }

    private static String compareStrings(String one, String second) {
        String[] ones = one.split("");
        Arrays.sort(ones);
        String[] seconds = second.split("");
        Arrays.sort(seconds);
        return Arrays.equals(ones, seconds) ? "Arrays are equal" : "Arrays are not equal";

    }

    private static String getStringFromUser() {
        return SCANNER.nextLine();
    }
}
