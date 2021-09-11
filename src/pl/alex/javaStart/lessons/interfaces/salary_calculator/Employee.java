package pl.alex.javaStart.lessons.interfaces.salary_calculator;

public abstract class Employee {
    public static final int NO_OF_MONTHS = 12;

    private final String name;
    private final String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    abstract double calculateYearSalary();

    abstract double calculateMonthlySalary();

    @Override
    public String toString() {

        return name + " " + surname +
                ", wypłata miesięczna: " +
                calculateMonthlySalary() +
                ", wypłata roczna: " +
                calculateYearSalary();
    }


}
