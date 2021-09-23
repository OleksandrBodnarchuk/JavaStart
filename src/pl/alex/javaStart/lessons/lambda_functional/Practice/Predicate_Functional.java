package pl.alex.javaStart.lessons.lambda_functional.Practice;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Predicate_Functional {
    public static void main(String[] args) {
        Predicate<Integer> ageVerifier = age -> age > 18;

        int teenagerAge = 16;
        System.out.println(ageVerifier.test(teenagerAge));


    }
}
