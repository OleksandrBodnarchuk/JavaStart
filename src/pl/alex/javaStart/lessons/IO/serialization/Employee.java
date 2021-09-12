package pl.alex.javaStart.lessons.IO.serialization;


public class Employee extends Person {
    private final double salary;

    public Employee(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary: " + salary + " EUR";
    }
}
