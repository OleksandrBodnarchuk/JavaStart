package pl.alex.javaStart.lessons.strings.excersise1;

import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        getInfoFromUser();

    }

    private static void getInfoFromUser() {
        System.out.println("Podaj liczbe:");
        int count = getInt();
        StringBuilder sb = new StringBuilder();
        do {
            String word = input.nextLine();
            // get last char in the string
            char letter = word.charAt(word.length()-1);
            // append it to the sb
            sb.append(letter);
            count--;
        } while (count != 0);
        System.out.println(sb);
    }

    private static int getInt() {
        int index = input.nextInt();
        input.nextLine();
        return index;
    }
}
