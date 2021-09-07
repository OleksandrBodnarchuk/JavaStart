package pl.alex.javaStart.lessons.polimorfism.game.app;

import pl.alex.javaStart.lessons.polimorfism.game.model.Attacker;
import pl.alex.javaStart.lessons.polimorfism.game.model.Defender;
import pl.alex.javaStart.lessons.polimorfism.game.model.Team;

public class App {
    public static void main(String[] args) {
        Attacker character1 = new Attacker("Joe", 100, 100, 100, 0.2);
        Attacker character2 = new Attacker("Martha", 100, 100, 100, 0.2);
        Defender character3 = new Defender("Kris", 100, 100, 100, 0.2);
        Attacker character4 = new Attacker("Matt", 100, 100, 100, 0.3);
        Attacker character5 = new Attacker("Martha", 100, 100, 100, 0.2);
        Defender character6 = new Defender("Belly", 100, 100, 100, 0.2);

        Team team1 = new Team("TeamOne", character2, character3, character1);
        Team team2 = new Team("TeamTwo", character5, character6, character4);
        BattleSimulator.fight(team1, team2);
    }
}
