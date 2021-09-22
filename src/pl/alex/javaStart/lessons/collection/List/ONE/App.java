package pl.alex.javaStart.lessons.collection.List.ONE;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final List<Double> list = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getIntegerFromUser();
        System.out.println(sum());
    }

    private static void getIntegerFromUser() {
        String input;
        do {
            System.out.println("Insert integer or exit to EXIT: ");
            input = scanner.nextLine().toLowerCase();
            try {
                list.add(Double.parseDouble(input));
            } catch (NumberFormatException ignored) {
            }
        } while (!input.equals("exit"));
    }
    private static int sum(){
        int sum = 0;
        for(Double i: list){
            sum+=i;
        }
        return sum;
    }

}
