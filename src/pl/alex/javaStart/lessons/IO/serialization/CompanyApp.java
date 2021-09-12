package pl.alex.javaStart.lessons.IO.serialization;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {
    private final static String FILE_NAME = "employees.info";
    private final static int READ_FROM_USER = 1;
    private final static int READ_FROM_FILE = 2;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input of Employees data - " + READ_FROM_USER);
        System.out.println("Output of Employees data - " + READ_FROM_FILE);

        int option = scanner.nextInt();
        scanner.nextLine();
        if (option == READ_FROM_USER) {
            Company company = createCompany();
            writeFile(company);
        } else if (option == READ_FROM_FILE) {

            try {
                Company company = readFile();
                System.out.println(company);
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error while reading " + FILE_NAME);
            }
        }
        scanner.close();

    }

    private static Company readFile() throws IOException, ClassNotFoundException {
        try (
                var inputStream = new FileInputStream(FILE_NAME);
                var file = new ObjectInputStream(inputStream);
        ) {
            return (Company) file.readObject();
        }


    }

    private static Company createCompany() {
        Company company = new Company();
        for (int i = 0; i < Company.MAX_EMPLOYEES; i++) {
            company.addEmployee(createEmployee(i));
        }
        return company;
    }

    private static Employee createEmployee(int i) {
        i++;
        System.out.println("Enter Employee " + i + " name.");
        String name = scanner.nextLine();
        System.out.println("Enter Employee " + i + " surname.");
        String surname = scanner.nextLine();
        System.out.println("Enter Employee " + i + " salary.");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        return new Employee(name, surname, salary);
    }

    private static void writeFile(Company company) {
        try (
                var file = new FileOutputStream(FILE_NAME);
                var oos = new ObjectOutputStream(file);
        ) {

            oos.writeObject(company);
            System.out.println("OK!");

        } catch (IOException e) {
            System.err.println("Error while writing into the file " + FILE_NAME);
        }
    }

}
