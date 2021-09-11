package pl.alex.javaStart.lessons.interfaces.area_calculator;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * length + 2 * width;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prostokąt, ");
        sb.append("bok A: " + length + ", ");
        sb.append("bok B: " + width + ", ");
        sb.append("pole: " + calculateArea() + ", ");
        sb.append("obwód: " + calculatePerimeter());
        return sb.toString();
    }

}
