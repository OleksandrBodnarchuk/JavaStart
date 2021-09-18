package pl.alex.javaStart.lessons.comparable_comparator.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class AppHelper {
    private final Home[] homes = new Home[10];

    public void readFromFile() {
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader("homeData.csv"))) {
            String line;
            int count = 0;
            bufferedReader.readLine(); // skip 1st line
            while ((line=bufferedReader.readLine())!=null){
                String[] arr = line.split(";");
                homes[count] = new Home(arr[0].trim(),Double.parseDouble(arr[1]),Double.parseDouble(arr[2]));
                count++;
            }
            System.out.println("Read completed. OK!");
        } catch (IOException e) {
            System.err.println("Error reading from file");
        }
    }

    public void printSortedHomes(){
        Arrays.sort(homes, Comparator.comparingDouble(Home::getPricePerMeter));
        System.out.println("Available homes for sale: ");
        for (Home home : homes) {
            System.out.println(home);
        }
    }

}
