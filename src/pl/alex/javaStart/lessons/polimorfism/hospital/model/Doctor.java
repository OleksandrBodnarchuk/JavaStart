package pl.alex.javaStart.lessons.polimorfism.hospital.model;

public class Doctor extends Person{
    private final double bonus;

    public Doctor(String name, String surname, double salary, double bonus) {
        super(name, surname, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return super.toString()+" Bonus: " + bonus;
    }
}
