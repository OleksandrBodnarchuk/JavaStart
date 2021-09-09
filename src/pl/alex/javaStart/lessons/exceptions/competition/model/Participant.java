package pl.alex.javaStart.lessons.exceptions.competition.model;
public class Participant {
    private String firstName;
    private String lastName;
    private String documentId;
    private int age;

    public Participant(String firstName, String lastName, String documentId, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentId = documentId;
        setAge(age);
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

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age<0) throw new IllegalArgumentException("Age has to be positive");
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", id: " + documentId + ", age: " + age;
    }
}