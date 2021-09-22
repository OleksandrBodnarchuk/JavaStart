package pl.alex.javaStart.lessons.collection.List.TWO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int next ;
        boolean numberIsCorrect = true;

        while(numberIsCorrect) {
            System.out.println("Podaj kolejn� liczb� nieujemn�, podzieln� przez 5");
            next = scanner.nextInt();
            if (next >= 0 && next % 5 == 0) {
                numbers.add(next);
            } else {
                numberIsCorrect = false;
            }
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double avg = ((double)sum) / numbers.size();

        System.out.println("Ile poprawnych liczb: " + numbers.size());
        System.out.println("Ich suma wynosi: " + sum);
        System.out.println("Natomiast �rednia to: " + avg);
    }
}
