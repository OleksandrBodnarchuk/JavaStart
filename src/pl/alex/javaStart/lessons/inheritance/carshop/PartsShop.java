package pl.alex.javaStart.lessons.inheritance.carshop;

import pl.alex.javaStart.lessons.inheritance.carshop.model.ExhaustPart;
import pl.alex.javaStart.lessons.inheritance.carshop.model.Tire;

public class PartsShop {
    public static void main(String[] args) {
        Tire tire = new Tire(123123,"Continental","WW2","SE01923141332",19.3,13);
        ExhaustPart exhaustPart = new ExhaustPart(1531231235, "Webber","EU23", "DS2131242351", true);

        tire.printInfo();
        exhaustPart.printInfo();
    }
}
