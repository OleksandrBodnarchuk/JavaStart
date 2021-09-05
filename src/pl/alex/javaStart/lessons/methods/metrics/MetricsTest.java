package pl.alex.javaStart.lessons.methods.metrics;

public class MetricsTest {
    public static void main(String[] args) {
        MetricsCalculator converter = new MetricsCalculator();
        double m = 2.5;
        double mToCm = converter.metersIntoCentimeters(m);
        double mToMm = converter.metersIntoMillimeters(m);
        System.out.println(m + "m to " + mToCm + "cm i " + mToMm + "mm");
    }
}
