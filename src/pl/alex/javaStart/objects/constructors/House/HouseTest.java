package pl.alex.javaStart.objects.constructors.House;

public class HouseTest {
    public static void main(String[] args) {
        House home = new House(10_000, 1000);
        home.resourcesInformation();
        home.takeShower();
        home.resourcesInformation();
        home.watchTV(4);
        home.resourcesInformation();
        home.boilWater();
        home.resourcesInformation();
    }
}

