package pl.alex.javaStart.lessons.interfaces.salary_calculator;

public class FullTimeEmployee extends Employee {
    private final double monthlySalary;
    private static final double YEAR_BONUS = 0.05;

    public FullTimeEmployee(String name, String surname, double monthlySalary) {
        super(name, surname);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateYearSalary() {
        return (monthlySalary * Employee.NO_OF_MONTHS)
                + (monthlySalary * YEAR_BONUS);
    }

    @Override
    double calculateMonthlySalary() {
        return monthlySalary;
    }

}
