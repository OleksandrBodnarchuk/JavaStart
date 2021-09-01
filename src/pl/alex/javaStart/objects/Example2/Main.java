package pl.alex.javaStart.objects.Example2;

public class Main {
    public static void main(String[] args) {
        Plant plant1 = new Plant("Daisy","Flower",0.1);
        Plant plant2 = new Plant("Baobab", "Tree",0.15);
        Plant plant3 = new Plant("Aloe","Plant",0.3);

        double dailyConsumption = plant1.dailyAmount+plant2.dailyAmount+plant3.dailyAmount;
        System.out.println("Dzienne zużycie wody przez wszystkie rośliny to: " + dailyConsumption + "l");
        System.out.println("Tygodniowe zużycie wody przez wszystkie rośliny to: " +(dailyConsumption*7)+ "l" );
        System.out.println("Roczne zużycie wody (365 dni) to: " +(dailyConsumption*365) + "l" );
    }
}
