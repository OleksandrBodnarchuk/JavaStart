package pl.alex.javaStart.lessons.loops.hospital.model;

public class Patient {
    private final String firstName;
    private final String lastName;
    private final String pesel;

    public Patient(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }
}
