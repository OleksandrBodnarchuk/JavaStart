package pl.alex.javaStart.lessons.staticc.mlCalculator;

//1 szklanka / kubek to 250ml,
//1 łyżka (stołowa) to 15ml,
//1 łyżeczka (do herbaty) to 5ml.
public class KitchenUtils {
    public static final int GLASS = 250;
    public static final int SPOON = 15;
    public static final int TEASPOON = 5;

    public static double calculateGlassIntoMl(double glasses){
        return glasses*GLASS;
    }

    public static double calculateSpoonIntoMl(double spoons){
        return spoons*SPOON;
    }

    public static double calculateTeaSpoonIntoMl(double teaspoons){
        return teaspoons*TEASPOON;
    }

}
