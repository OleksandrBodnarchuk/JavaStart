package pl.alex.javaStart.lessons.IO.serialization;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 169230144059693105L;
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name+" "+surname;
    }
}
