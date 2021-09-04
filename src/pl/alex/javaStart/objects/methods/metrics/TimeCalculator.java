package pl.alex.javaStart.objects.methods.metrics;

public class TimeCalculator {

    double hoursIntoMinutes(double hour){
        return hour*60;
    }

    double minutesIntoSeconds(double minutes){
        return minutes*60;
    }

    double secondsIntoMilliSeconds(double seconds){
        return seconds*1000;
    }
}
