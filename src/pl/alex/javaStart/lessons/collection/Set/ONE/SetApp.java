package pl.alex.javaStart.lessons.collection.Set.ONE;

import java.io.*;
import java.util.*;

public class SetApp {
    private static final TreeSet<Person> peopleSet = new TreeSet<>((o1, o2) -> -(o1.getName().compareTo(o2.getName())));
    private static final String FILE_NAME = "namespl.txt";

    public static void main(String[] args) {
        readFromFileAndFillTheList();



    }


    private static void readFromFileAndFillTheList() {
        try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
            while (scanner.hasNextLine()) {
                peopleSet.add(new Person(scanner.nextLine()));
            }
            System.out.println("Unique names: " + peopleSet);
            System.out.println("First element: " + peopleSet.first());
            System.out.println("Last element: " + peopleSet.last());

        } catch (FileNotFoundException e) {
            System.out.println("File not found ");
        }
    }
}
