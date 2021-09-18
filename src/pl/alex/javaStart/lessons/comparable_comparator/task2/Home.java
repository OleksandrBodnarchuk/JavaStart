package pl.alex.javaStart.lessons.comparable_comparator.task2;

public class Home implements Comparable<Home> {
    private final String city;
    private final double totalPrice;
    private final double area;
    private final double pricePerMeter;

    public Home(String city, double totalPrice, double area) {
        this.city = city;
        this.totalPrice = totalPrice;
        this.area = area;
        this.pricePerMeter = totalPrice / area;
    }

    public double getPricePerMeter() {
        return pricePerMeter;
    }

    @Override
    public String toString() {
        return city + ", " +
                totalPrice + "zł, " +
                area + "mkw, " +
                String.format("%.2f",pricePerMeter) + "zł/mkw";
    }

    @Override
    public int compareTo(Home o) {
        return Double.compare(this.pricePerMeter, o.getPricePerMeter());
    }
}
