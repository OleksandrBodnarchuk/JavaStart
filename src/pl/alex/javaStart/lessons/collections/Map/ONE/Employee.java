package pl.alex.javaStart.lessons.collections.Map.ONE;

import java.util.Objects;

public class Employee {
    private final String name;
    private final String surname;
    private double salary;

    public Employee(String name, String surname, double salary) {
        this(name, surname);
        this.salary = salary;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return name + " " + surname + " - " + salary;
    }
}
