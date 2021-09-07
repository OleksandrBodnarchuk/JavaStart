package pl.alex.javaStart.lessons.inheritance.fruits.model;

public class Apple extends Fruit {
    private final String variety;

    public Apple(double weight, String type, String variety) {
        super(weight, type);
        this.variety = variety;
    }

    @Override
    public String getInfo() {
        return variety + " " + super.getInfo();
    }
}
