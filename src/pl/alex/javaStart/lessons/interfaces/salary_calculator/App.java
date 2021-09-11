package pl.alex.javaStart.lessons.interfaces.salary_calculator;

public class App {
    public static void main(String[] args) {
        Employee[] employees = createEmployees();
        double totalMonthlySalaries = totalMonthlySalaries(employees);
        double totalYearlySalaries = totalYearlySalaries(employees);

        printEmployees(employees);
        System.out.println("Suma miesięcznych wynagrodzeń: " + totalMonthlySalaries);
        System.out.println("Suma rocznych wynagrodzeń: " + totalYearlySalaries);
    }

    private static void printEmployees(Employee[] employees) {
        System.out.println("Pracownicy:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static double totalYearlySalaries(Employee[] employees) {
        double totalYearlySalaries = 0;
        for (Employee employee : employees) {
            totalYearlySalaries += employee.calculateYearSalary();
        }
        return totalYearlySalaries;
    }

    private static double totalMonthlySalaries(Employee[] employees) {
        double totalMonthlySalaries = 0;
        for (Employee employee : employees) {
            totalMonthlySalaries += employee.calculateMonthlySalary();
        }
        return totalMonthlySalaries;
    }

    private static Employee[] createEmployees() {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("Jan", "Kowalski", 5000);
        employees[1] = new PartTimeEmployee("Anna", "Borowska", 10, 80);
        return employees;
    }
}
