package pl.alex.javaStart.ClassAndObject.Example1;

class Employee {
    String name;
    String surName;
    int age;
    int seniority;

    public Employee(String name, String surName, int age, int seniorityMonths) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.seniority = seniorityMonths;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", seniority=" + seniority +
                '}';
    }
}
