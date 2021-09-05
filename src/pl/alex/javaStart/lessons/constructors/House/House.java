package pl.alex.javaStart.lessons.constructors.House;

public class House {
    double waterLitres, dieselLitres;

    public House(double waterLitres, double dieselLitres) {
        this.waterLitres = waterLitres;
        this.dieselLitres = dieselLitres;
    }

    void takeShower() {
        System.out.println("Taking shower");
        waterLitres = waterLitres-48;
    }

    void takeBath() {
        System.out.println("Taking bath");
        waterLitres = waterLitres-86;
    }

    void makeDinner() {
        System.out.println("Making dinner");
        dieselLitres = dieselLitres-0.1;
        waterLitres =waterLitres- 4;
    }

    void boilWater() {
        System.out.println("Boiling water");
        dieselLitres = dieselLitres -0.05;
        waterLitres = waterLitres- 0.5;
    }

    void watchTV(int hours) {
        System.out.println("Watching TV for "+hours+" hours");
        dieselLitres = dieselLitres- (hours*0.06);
    }

    void resourcesInformation() {
        System.out.println("Water amount left: " + waterLitres + " Diesel amount left:" + dieselLitres);
    }
}
