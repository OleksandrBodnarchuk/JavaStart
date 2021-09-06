package pl.alex.javaStart.lessons.inheritance.courses;

public class Stationary extends Course {
    private final String city;
    private final int amountOfClasses;

    public Stationary(String name, String info, double price, String city, int amountOfClasses) {
        super(name, info, price);
        this.city = city;
        this.amountOfClasses = amountOfClasses;
    }

    public String getCity() {
        return city;
    }

    public int getAmountOfClasses() {
        return amountOfClasses;
    }
}

