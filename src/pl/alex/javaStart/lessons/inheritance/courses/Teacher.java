package pl.alex.javaStart.lessons.inheritance.courses;

public class Teacher {
    private final String name;
    private final String surname;

    public Teacher(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
