package pl.alex.javaStart.lessons.recursion.factorial;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter number:");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Factorial is: " + factorialNumber(number));
        scanner.close();
    }

    public static int factorialNumber(int number) {
        return number > 1 ? number * factorialNumber(number - 1) : 1;

    }
}
