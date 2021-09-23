package pl.alex.javaStart.lessons.lambda_functional.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda_Generics {
    public static void main(String[] args) {

        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] ages = {22, 33, 44, 55};
        Random random = new Random();
        List<Person> people = generateRandomList(9, () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        });


        System.out.println("\nOriginal:\n");
        consumeList(people, System.out::println);

        System.out.println("\nAge + 1\n");
        consumeList(people, p -> {
            p.setAge(p.getAge() + 1);
            System.out.println(p);
        });

        System.out.println("\nAge 18\n");
        List<Person> personsAge18 = predicateBy(people, p -> p.age >= 18);
        consumeList(personsAge18, System.out::println);

        System.out.println("\nList of Kowalski\n");
        List<Person> personsSurname_K = predicateBy(people, p -> p.surname.startsWith("K"));
        consumeList(personsSurname_K, System.out::println);

        System.out.println("\nList of names only:\n");
        List<String> peopleByFirstName = functionBy(people, p -> p.name);
        consumeList(peopleByFirstName, System.out::println);
    }

    private static <T> List<T> generateRandomList(int number, Supplier<T> supplier) {
        List<T> persons = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            T t = supplier.get();
            persons.add(t);
        }
        return persons;
    }

    private static <T> void consumeList(List<T> people, Consumer<T> consumer) {
        for (T p : people) {
            consumer.accept(p);
        }
    }

    private static <T> List<T> predicateBy(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T type : list) {
            if (predicate.test(type)) {
                result.add(type);
            }
        }
        return result;
    }

    private static <T, R> List<R> functionBy(List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for (T t : list) {
            R result = function.apply(t);
            resultList.add(result);
        }
        return resultList;
    }

    static class Person {
        private final String name;
        private final String surname;
        private int age;

        public Person(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }
}
