package pl.alex.javaStart.lessons.collection.Map.ONE;

import java.util.Scanner;

public class CompanyApp {
    private static final int EXIT = 0;
    private static final int ADD_EMPLOYEE = 1;
    private static final int SEARCH_EMPLOYEE = 2;
    private static final Company company = new Company();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

    }

    private static void menu() {
        int option;
        do {
            printOptions();
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case ADD_EMPLOYEE -> addEmployee();
                case SEARCH_EMPLOYEE -> searchEmployee();
                case EXIT -> exit();
            }
        } while (option != EXIT);
    }

    private static void printOptions() {
        System.out.println(" - EXIT: " + EXIT);
        System.out.println(" - ADD EMPLOYEE: " + ADD_EMPLOYEE);
        System.out.println(" - SEARCH EMPLOYEE: " + SEARCH_EMPLOYEE);
    }

    private static void addEmployee() {
        Employee employee = getEmployeeDataWithSalary();
        company.addEmployee(employee);
    }

    private static Employee getEmployeeDataWithSalary() {
        Employee employee = getEmployeeData();
        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        return new Employee(employee.getName(), employee.getSurname(), salary);
    }

    private static void searchEmployee() {
        Employee employee = getEmployeeData();
        company.findEmployee(employee);
    }

    private static Employee getEmployeeData() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter surname: ");
        String surname = scanner.nextLine();
        return new Employee(name, surname);

    }

    private static void exit() {
        System.out.println("BYE!");
        scanner.close();
    }


}
