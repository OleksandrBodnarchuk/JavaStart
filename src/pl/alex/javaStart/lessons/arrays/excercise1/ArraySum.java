package pl.alex.javaStart.lessons.arrays.excercise1;

public class ArraySum {
    public static void main(String[] args) {
        int [] arr1 = {1,5,8};
        int [] arr2 = {12,51,38};
        printSum(arr1,arr2);

    }

    public static void printSum(int[]arr1,int[]arr2){
        int sum = 0;
        for (Integer i: arr1) {
            sum+=i;
        }
        for (Integer i: arr2) {
            sum+=i;
        }
        System.out.println("Sum of 2 tables is: " + sum);
    }
}
