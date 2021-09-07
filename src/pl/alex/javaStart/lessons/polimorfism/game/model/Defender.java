package pl.alex.javaStart.lessons.polimorfism.game.model;

public class Defender extends GameCharacter {
    private double extraDefense;

    public Defender(String name, int energy, int attack, int defense, double extraDefense) {
        super(name, energy, attack, defense);
        this.extraDefense = extraDefense;
    }

    @Override
   public double totalDefense() {
        return getDefense() + getDefense() * extraDefense;
    }

    public double getExtraDefense() {
        return extraDefense;
    }

    public void setExtraDefense(double extraDefense) {
        this.extraDefense = extraDefense;
    }
}
