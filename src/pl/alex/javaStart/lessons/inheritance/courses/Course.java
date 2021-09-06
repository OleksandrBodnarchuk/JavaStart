package pl.alex.javaStart.lessons.inheritance.courses;

public class Course {
    private final String name;
    private final String info;
    private final double price;

    public Course(String name, String info, double price) {
        this.name = name;
        this.info = info;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public double getPrice() {
        return price;
    }
}
