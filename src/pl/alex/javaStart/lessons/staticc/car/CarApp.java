package pl.alex.javaStart.lessons.staticc.car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Car(10, true, true, false, false);
        System.out.println("Uruchomienie samochodu z paliwem, sprawnym silnikiem i wszystkim zamkniętym");
        car.start();
        System.out.println(car.status());
        System.out.println();

        System.out.println("Otwarcie drzwi");
        car.setDoorsOpen(true);
        System.out.println(car.status());
        System.out.println();

        System.out.println("Kończy się paliwo");
        car.setFuel(0);
        System.out.println(car.status());
    }
}
