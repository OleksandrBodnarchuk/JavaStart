package pl.alex.javaStart.lessons.inner_classes.bubble_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Sortable sortable = array -> {
            int length = array.length;
            int temp;
            for (int i = 0; i < length; i++) {
                for (int j = 1; j < (length-i) ; j++) {
                    if (array[j - 1] > array[j]) {
                        temp = array[j-1];
                        array[j-1]=array[j];
                        array[j]=temp;
                    }
                }
            }

        };
        int[] arr  = {5, 10, -8, -23, 1009, 2938, 153, 24};
        sortable.sort(arr);
        printArray(arr);

    }

    private static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
