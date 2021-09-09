package pl.alex.javaStart.lessons.exceptions.competition;

import pl.alex.javaStart.lessons.exceptions.competition.controller.CompetitionController;

class CompetitionApp {
    public static void main(String[] args) {
        CompetitionController competitionController = new CompetitionController();
        competitionController.run();
    }
}
