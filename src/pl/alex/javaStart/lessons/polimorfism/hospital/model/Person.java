package pl.alex.javaStart.lessons.polimorfism.hospital.model;

public class Person {
    private final String name;
    private final String surname;
    private final double salary;

    public Person(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return  "Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Salary=" + salary +
                '}';
    }
}
