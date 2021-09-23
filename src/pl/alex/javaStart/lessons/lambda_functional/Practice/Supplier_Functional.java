package pl.alex.javaStart.lessons.lambda_functional.Practice;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Supplier_Functional {
    public static void main(String[] args) {
        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] ages = {22, 33, 44, 55};
        var random = new Random();

        Supplier<Person> personSupplier = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName,lastName,age);
        };

        Consumer<Person> personConsumer = System.out::println;

        personConsumer.accept(personSupplier.get());
        personConsumer.accept(personSupplier.get());
        personConsumer.accept(personSupplier.get());

/*
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            Person randomPerson = new Person(firstName, lastName, age);
            people.add(randomPerson);
        }
        for (Person person : people) {
            System.out.println(person);
        }
*/
    }
}


class Person {
    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
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

