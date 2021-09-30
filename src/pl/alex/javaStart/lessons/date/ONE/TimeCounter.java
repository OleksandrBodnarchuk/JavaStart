package pl.alex.javaStart.lessons.date.ONE;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class TimeCounter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Press ENTER to start timer:");
        String startStop = scanner.nextLine();
        Instant initial;
        if (startStop.isEmpty()) {
            initial = Instant.now();
            do {
                System.out.println("Press ENTER to stop timer:");
                startStop = scanner.nextLine();
            } while (!startStop.isEmpty());
            Instant end = Instant.now();
            Duration duration = Duration.between(initial,end);

            System.out.println("Time: " + duration.getSeconds()+" seconds.");
            scanner.close();
        }
    }
}
