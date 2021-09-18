package pl.alex.javaStart.lessons.comparable_comparator.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Integer[] array = new Integer[20];
        fillArray(array);
        System.out.println("Before: ");
        printArray(array);
        Arrays.sort(array);
        System.out.println("After sort: ");
        printArray(array);
        System.out.println("After reverse sort: ");
        Arrays.sort(array,(o1,o2)-> -(o1.compareTo(o2)));
        printArray(array);

    }

    private static void fillArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(1000);
        }
    }

    private static void printArray(Integer[] arr) {
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
