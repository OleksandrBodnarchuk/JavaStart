package pl.alex.javaStart.lessons.interfaces.salary_calculator;

public class PartTimeEmployee extends Employee {

    private final double hoursWorked;
    private final double hourlyRate;

    public PartTimeEmployee(String name, String surname, double hoursWorked, double hourlyRate) {
        super(name, surname);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateYearSalary() {
        return calculateMonthlySalary() * Employee.NO_OF_MONTHS;
    }

    @Override
    double calculateMonthlySalary() {
        return hourlyRate * hoursWorked;
    }


}
