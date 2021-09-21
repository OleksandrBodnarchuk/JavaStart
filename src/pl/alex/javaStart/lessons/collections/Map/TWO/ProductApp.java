package pl.alex.javaStart.lessons.collections.Map.TWO;

import com.sun.source.util.Trees;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductApp {
    public static void main(String[] args) {
        try {
            Map<String, TreeSet<Product>> productMap = StoreHelper.readFile("sklep.txt");
            String category = readCategoryFromUser();
            printCategoryStats(productMap, category);
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku z danymi produktów");
        }
    }

    private static void printCategoryStats(Map<String, TreeSet<Product>> productMap, String category) {
        TreeSet<Product> products = productMap.get(category);
        if (products == null) {
            System.out.println("Brak produktów w danej kategorii");
        } else {
            printAll(products);
            printAvgPrice(products);
            printCheapestAndExpensiveProduct(products);
        }
    }

    private static void printAvgPrice(TreeSet<Product> products) {
        double sumPrice = 0;
        for (Product product : products) {
            sumPrice += product.getPrice();
        }
        double avgPrice = sumPrice / products.size();
        System.out.println("Średnia cena produktów: " + avgPrice);
    }

    private static void printCheapestAndExpensiveProduct(TreeSet<Product> products) {
        System.out.println("Najtańszy produkt: " + products.first());
        System.out.println("Najdroższy produkt: " + products.last());
    }

    private static void printAll(TreeSet<Product> products) {
        products.forEach(System.out::println);
    }

    private static String readCategoryFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę kategorii dla wyświetlenia statystyk:");
        return scanner.nextLine();
    }
}
