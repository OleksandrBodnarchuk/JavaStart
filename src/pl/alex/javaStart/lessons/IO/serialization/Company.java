package pl.alex.javaStart.lessons.IO.serialization;

import java.io.Serializable;
import java.util.Arrays;

public class Company implements Serializable {

    public static final int MAX_EMPLOYEES = 3;
    private final Employee[] employees = new Employee[MAX_EMPLOYEES];
    private int employeesAdded;

    public void addEmployee(Employee employee) {
        if (employeesAdded <= MAX_EMPLOYEES) {
            employees[employeesAdded] = employee;
            employeesAdded++;
        } else {
            System.out.println("No more space!");
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Employee e : employees) {
            sb.append(e.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
