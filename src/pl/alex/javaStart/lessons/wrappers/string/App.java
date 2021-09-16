package pl.alex.javaStart.lessons.wrappers.string;

import javax.swing.*;
import java.util.Scanner;

public class App {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = getUserInput();
        printResults(input);


    }

    private static void printResults(String input) {
        int numberCount = getNumberCount(input);
        int lettersCount = getLettersCount(input);
        int biggestNumber = getBiggestNumber(input);
        printLine("Amount of numbers in text: " + numberCount);
        printLine("Amount of letters in text: " + lettersCount);
        printLine("The biggest number in text: " + biggestNumber);
    }

    private static int getBiggestNumber(String input) {
        int biggestNumber = -1;
        String[] arr = input.split("");
        for (int i = 0; i < arr.length; i++)
            if (Character.isDigit(input.charAt(i))) {
                if (biggestNumber < Integer.parseInt(arr[i])) {
                    biggestNumber = Integer.parseInt(arr[i]);
                }
            }

        return biggestNumber;
    }

    private static int getLettersCount(String input) {
        int letters = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isAlphabetic(input.charAt(i))) {
                letters++;
            }
        }
        return letters;
    }

    private static int getNumberCount(String input) {
        int numbers = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                numbers++;
            }
        }
        return numbers;

    }

    private static String getUserInput() {
        printLine("Your text: ");
        return scanner.nextLine();
    }

    private static void printLine(String line) {
        System.out.println(line);
    }
}
