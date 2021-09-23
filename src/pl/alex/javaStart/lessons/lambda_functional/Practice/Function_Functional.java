package pl.alex.javaStart.lessons.lambda_functional.Practice;

import java.util.Arrays;
import java.util.function.Function;

public class Function_Functional {
    public static void main(String[] args) {
        Function<String, String[]> toLowerCaseArray = s -> s.toLowerCase().trim().split(" ");
        String big = " BoB is Jao PAo     ";

        String[] small = toLowerCaseArray.apply(big);

        System.out.println(Arrays.toString(small));
    }
}
