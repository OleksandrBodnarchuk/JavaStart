package pl.alex.javaStart.library.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public abstract class User implements Serializable,CsvConvertible {
    @Serial
    private static final long serialVersionUID = -277650809497821566L;
    private final String name;
    private final String surname;
    private final String PESEL;

    public User(String name, String surname, String PESEL) {
        this.name = name;
        this.surname = surname;
        this.PESEL = PESEL;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPESEL() {
        return PESEL;
    }

    public abstract String toCsv();
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(PESEL, user.PESEL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, PESEL);
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + PESEL;
    }
}
