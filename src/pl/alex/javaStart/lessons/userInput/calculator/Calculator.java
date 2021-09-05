package pl.alex.javaStart.lessons.userInput.calculator;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    private final Scanner scanner = new Scanner(System.in);
    private double getFirstValue(){
        System.out.println("Input first value: ");
        scanner.useLocale(Locale.US);
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

    private String getOperationValue(){
        System.out.println("Input operand on values [+ - / or *]: ");
        return scanner.nextLine();
    }

    private double getSecondValue(){
        System.out.println("Input second value: ");
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

    public void run(){
        double firstValue = getFirstValue();
        String operation = getOperationValue();
        double secondValue = getSecondValue();
        double result = calculateResult(firstValue,operation,secondValue);
        System.out.println("Result is: " + result);
        scanner.close();

    }

    private double calculateResult(double firstValue, String operation, double secondValue) {
        return switch (operation) {
            case "+" -> firstValue + secondValue;
            case "-" -> firstValue - secondValue;
            case "/" -> firstValue / secondValue;
            case "*" -> firstValue * secondValue;
            default -> 0;
        };
    }


}
