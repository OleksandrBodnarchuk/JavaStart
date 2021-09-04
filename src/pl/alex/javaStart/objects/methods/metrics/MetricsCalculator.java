package pl.alex.javaStart.objects.methods.metrics;

public class MetricsCalculator {

    double metersIntoCentimeters(double meters){
        return meters*100;
    }
    double metersIntoMillimeters(double meters){
        return meters*1000;
    }
    double centimetersIntoMeters(double centimeters){
        return centimeters/100;
    }
    double millimetersIntoMeters(double millimeters){
        return millimeters/1000;
    }

}
