package pl.alex.javaStart.lessons.stream.ONE;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.iterate(0, integer -> integer + 1)
                .filter(integer -> (integer > 100 && integer < 1000 && integer % 5 == 0))
                .limit(10)
                .map(integer -> integer * 3)
                .forEach(System.out::println);
    }
}
