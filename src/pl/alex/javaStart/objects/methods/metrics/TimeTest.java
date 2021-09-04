package pl.alex.javaStart.objects.methods.metrics;

public class TimeTest {
    public static void main(String[] args) {
        TimeCalculator converter = new TimeCalculator();
        int hours = 14;
        int minutes = (int) converter.hoursIntoMinutes(hours);
        int seconds = (int) converter.minutesIntoSeconds(minutes);
        int millis = (int) converter.secondsIntoMilliSeconds(seconds);
        System.out.println(hours + " godzin to " + millis + " milisekund");
    }

}
