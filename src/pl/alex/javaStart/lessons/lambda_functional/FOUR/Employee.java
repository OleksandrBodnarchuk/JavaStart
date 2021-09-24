package pl.alex.javaStart.lessons.lambda_functional.FOUR;
class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private final Employment employment;

    public Employee(String firstName, String lastName, double salary, Employment employment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.employment = employment;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employment getEmployment() {
        return employment;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", employment=" + employment +
                '}';
    }


  static String getFullName(Employee employee) {
        return employee.getFirstName()+" "+ employee.getLastName();
    }


}
