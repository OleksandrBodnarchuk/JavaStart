package pl.alex.javaStart.lessons.stream.THREE;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FileStream {
    public static void main(String[] args) {
        final String fileName = "loremipsum.txt";

        List<String> words = null;
        try {
            words = readFile(fileName);
            showWordStats(words);
        } catch (Exception e) {
            System.out.println("Błąd odczytu pliku " + fileName);
        }
    }

    private static void showWordStats(List<String> words) {

        long sWords = words
                .stream()
                .filter(word -> word.startsWith("s"))
                .count();
        System.out.println("Liczba wyrazów na 's': " + sWords);
        long five = words
                .stream()
                .filter(word -> word.length() == 5)
                .count();
        System.out.println("Liczba wyrazów z 5 znakami: " + five);
    }

    private static List<String> readFile(String fileName) throws IOException {
        try (var reader = new BufferedReader(new FileReader(fileName))) {
            return reader
                    .lines()
                    .map(line -> line.split(" "))
                    .flatMap(Arrays::stream)
                    .map(s -> s.replaceAll("[,.]", ""))
                    .collect(Collectors.toList());

        }
    }
}
