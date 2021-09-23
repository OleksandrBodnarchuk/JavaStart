package pl.alex.javaStart.lessons.lambda_functional.Practice;


import java.util.function.Consumer;


public class Consumer_Functional {
    public static void main(String[] args) {
        Consumer<String> print3Times = s -> {
            System.out.print(s);
            System.out.print(s);
            System.out.println(s);
        };

        String a = "Kiss ";
        String b = "My ";
        String c = "Piss ";

        print3Times.accept(a);
        print3Times.accept(b);
        print3Times.accept(c);

    }
}
