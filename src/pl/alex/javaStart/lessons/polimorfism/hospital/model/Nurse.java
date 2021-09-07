package pl.alex.javaStart.lessons.polimorfism.hospital.model;

public class Nurse extends Person {
    private final int overHours;

    public Nurse(String name, String surname, double salary, int overHours) {
        super(name, surname, salary);
        this.overHours = overHours;
    }

    public int getOverHours() {
        return overHours;
    }

    @Override
    public String toString() {
        return super.toString() + " Overhours:" + overHours + "h";
    }
}
