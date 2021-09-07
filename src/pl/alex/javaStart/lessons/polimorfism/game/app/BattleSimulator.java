package pl.alex.javaStart.lessons.polimorfism.game.app;

import pl.alex.javaStart.lessons.polimorfism.game.model.Team;

public class BattleSimulator {
    static void fight(Team team1, Team team2) {
        double team2Energy = attack(team1, team2);
        double team1Energy = attack(team2, team1);
        double energyDiff = team1Energy - team2Energy;
        if (energyDiff > 0) {
            System.out.println("Wygrywa drużyna " + team1.getName() + " z przewagą " + energyDiff + " energii");
        } else if (energyDiff < 0) {
            System.out.println("Wygrywa drużyna " + team2.getName() + " z przewagą " + (-energyDiff) + " energii");
        } else {
            System.out.println("Remis, obie drużyny zachowały " + team1Energy + " energii");
        }
    }

    private static double attack(Team attacker, Team defender) {
        double attack = attacker.attack();
        double defense = defender.defense();
        double attackPower = attack - defense;
        double energy = defender.energy();
        if (attackPower > 0) {
            return energy - attackPower;
        } else {
            return energy;
        }
    }
}
