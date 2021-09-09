package pl.alex.javaStart.lessons.exceptions.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorUtil {
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";

    private final Scanner input = new Scanner(System.in);

    public void run() {
        double a = getValue();
        double b = getValue();
        try {
            System.out.println("Choose operation (+, -, * or /):");
            String operator = input.nextLine();
            calculate(a, b, operator);

        } catch (ArithmeticException | UnknownOperationException e) {
            System.out.println(e.getMessage());
        }
    }

    private double getValue() {
        double value = 0;
        boolean flag = true;
        do {
            try {
                System.out.println("Provide value:");
                value = input.nextDouble();
                input.nextLine();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Only numbers are allowed!");
                input.nextLine();
            }
        } while (flag);
        return value;
    }

    private double add(double a, double b) {
        return a + b;
    }

    private double divide(double a, double b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Can't use 0");
        }
        return a / b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }


    private void calculate(double a, double b, String operator) {
        double result = 0;
        switch (operator) {
            case PLUS:
                result = add(a, b);
                break;
            case MINUS:
                result = subtract(a, b);
                break;
            case MULTIPLY:
                result = multiply(a, b);
                break;
            case DIVIDE:
                if (b == 0)
                    throw new ArithmeticException("Cant divide by 0");
                result = divide(a, b);
                break;
            default:
                throw new UnknownOperationException("Wrong operation provided!");


        }
        System.out.println("Result: " + result);
    }


}

