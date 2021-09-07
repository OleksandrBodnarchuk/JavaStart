package pl.alex.javaStart.lessons.inheritance.fruits.model;

public class Fruit {
    private final double weight;
    private final String type;

    public Fruit(double weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public String getInfo() {
        return type + " |" + " Weight: " + weight + " grams";
    }
}
