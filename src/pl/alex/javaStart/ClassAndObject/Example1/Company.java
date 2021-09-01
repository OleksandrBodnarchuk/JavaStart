package pl.alex.javaStart.ClassAndObject.Example1;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob","Billick", 1984,12);
        Employee employee2 = new Employee("Jeff", "Bezos", 1964, 15);
        Employee employee3 = new Employee("Elon", "Musk", 1973, 13);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.print(employee3);
    }
}

