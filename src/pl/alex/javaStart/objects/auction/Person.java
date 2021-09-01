package pl.alex.javaStart.objects.auction;



public class Person {
    String firstName;
    String lastName;
    Address address;

    public Person(String firstName, String lastName, Address address) {
        this(firstName,lastName);
        this.address = address;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName +  lastName;
    }
}
