package pl.alex.javaStart.lessons.enums.pizzeria;

import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dostępne pizze:");
        for(Pizza p : Pizza.values()){
            System.out.println(p);
        }

        System.out.println("Jaką wybierasz?");
        Pizza pizza = Pizza.valueOf(scanner.nextLine());

        System.out.println("Dziękujemy za zamówienie pizzy " + pizza.name());
        scanner.close();
    }
}
