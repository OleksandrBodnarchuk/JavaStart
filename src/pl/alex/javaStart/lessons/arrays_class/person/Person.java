package pl.alex.javaStart.lessons.arrays_class.person;

import java.util.Objects;

public class Person {
    private  String name;
    private  String surname;
    private  String PESEL;

    public Person() {
    }

    public Person(String name, String surname, String PESEL) {
        this.name = name;
        this.surname = surname;
        this.PESEL = PESEL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(PESEL, person.PESEL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, PESEL);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", PESEL='" + PESEL + '\'' +
                '}';
    }
}
