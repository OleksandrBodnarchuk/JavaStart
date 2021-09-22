package pl.alex.javaStart.lessons.collection.Iterator.ONE;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PersonApp {
    public static void main(String[] args) {
        Map<String, Person> personMap = new TreeMap<>();
        personMap.put("Kowalski", new Person("Jan", "Kowalski", 35));
        personMap.put("Adamiak", new Person("Ania", "Adamiak", 21));
        personMap.put("Zaręba", new Person("Adam", "Zaręba", 17));
        personMap.put("Piotrowski", new Person("Karol", "Piotrowski", 42));
        personMap.put("Bobrowska", new Person("Michalina", "Bobrowska", 15));

        for (Person person : personMap.values()) {
            System.out.println(person.toString());
        }
    }
}
