package pl.alex.javaStart.lessons.encapsulation.Excercise1;

public class Client {
    private String name;
    private String surname;
    private boolean isPremium;

    public Client() {
    }

    public Client(String name, String surname, boolean isPremium) {
        this.name = name;
        this.surname = surname;
        this.isPremium = isPremium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }
}
