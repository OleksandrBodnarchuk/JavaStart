package pl.alex.javaStart.lessons.loops.sum;

import java.util.Scanner;

//Napisz program, który najpierw pobiera od użytkownika liczbę mówiącą o tym ile liczb chce wprowadzić.
// Następnie pobierz od niego tyle liczb ile zadeklarował, zsumuj je i wyświetl na ekranie wynik.
// W programie wykorzystaj co najwyżej dwie zmienne liczbowe (wliczając w to również potencjalne zmienne liczników pętli) i nie używaj tablic
class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Input amount of numbers:");
        int number = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < number; i++) {
            System.out.println("Insert number #" + (i+1));
            sum+=scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum of " + number + " inserted numbers is "+ sum);
    }
}
