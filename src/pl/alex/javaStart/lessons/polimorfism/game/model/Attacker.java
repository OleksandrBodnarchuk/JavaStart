package pl.alex.javaStart.lessons.polimorfism.game.model;

public class Attacker extends GameCharacter {
    private double extraAttack;

    public Attacker(String name, int energy, int attack, int defense, double extraAttack) {
        super(name, energy, attack, defense);
        this.extraAttack = extraAttack;
    }

    @Override
    public double totalAttack() {
        return getAttack() + extraAttack * getAttack();
    }

    public double getExtraAttack() {
        return extraAttack;
    }

    public void setExtraAttack(double extraAttack) {
        this.extraAttack = extraAttack;
    }
}
