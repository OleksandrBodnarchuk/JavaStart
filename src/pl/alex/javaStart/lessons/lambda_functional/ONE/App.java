package pl.alex.javaStart.lessons.lambda_functional.ONE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        supplyWithRandom(10, () -> integers.add(random.nextInt(100)));
        System.out.println("\nCREATED LIST");
        consumerPrint(integers, integer -> System.out.print(integer + " "));
        predication(integers, integer -> integer % 2 == 0);
        System.out.println("\n\nVALUES % 2 != 0");
        consumerPrint(integers, integer -> System.out.print(integer + " "));


    }

    private static <T> void predication(List<T> integers, Predicate<T> predicate) {
        Iterator<T> iterator = integers.listIterator();
        while (iterator.hasNext()){
           T tmp = iterator.next();
           if (predicate.test(tmp)){
               iterator.remove();
           }
        }
    }

    private static <T> void supplyWithRandom(int length, Supplier<T> supplier) {
        for (int j = 0; j < length; j++) {
            supplier.get();
        }
    }

    private static <T> void consumerPrint(List<T> integers, Consumer<T> consumer) {
        for (T t : integers) {
            consumer.accept(t);
        }
    }


}
