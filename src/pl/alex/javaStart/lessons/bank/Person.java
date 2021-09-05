package pl.alex.javaStart.lessons.bank;

public class Person {
    String firstName;
    String lastName;
    String pesel;
    Address address;

    public Person(String firstName, String lastName, String pesel, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.address = address;
    }

    @Override
    public String toString() {
        return  firstName + lastName;
    }
}
