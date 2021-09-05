package pl.alex.javaStart.lessons.encapsulation.Excercise2.model;

public class Client {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Client(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        return age;
    }


    public String getFullName() {
        return firstName + " " + this.lastName;
    }
}
