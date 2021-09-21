package pl.alex.javaStart.lessons.collections.Map.ONE;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private final Map<String, Employee> employeeMap = new HashMap<>();

    public void findEmployee(Employee employee) {
        String key = employee.getName() + employee.getSurname();
        if (employeeMap.containsKey(key)){
            System.out.println(employeeMap.get(key));
        } else{
            System.out.println(key+" - was not found. Try again!");
        }

    }

    public void addEmployee(Employee employee) {
        String key = employee.getName() + employee.getSurname();
        if (!employeeMap.containsKey(key)) {
            employeeMap.put(key, employee);
        } else {
            System.out.println("Employee is on the list already!");
        }
    }
}
