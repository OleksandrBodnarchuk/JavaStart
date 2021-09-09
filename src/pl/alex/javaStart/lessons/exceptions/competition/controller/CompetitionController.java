package pl.alex.javaStart.lessons.exceptions.competition.controller;

import pl.alex.javaStart.lessons.exceptions.competition.exceptions.AgeViolationException;
import pl.alex.javaStart.lessons.exceptions.competition.exceptions.DuplicateException;
import pl.alex.javaStart.lessons.exceptions.competition.exceptions.MaxCompetitorsException;
import pl.alex.javaStart.lessons.exceptions.competition.model.Competition;
import pl.alex.javaStart.lessons.exceptions.competition.model.Participant;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CompetitionController {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        Competition competition = createCompetition();
        fillParticipantsInfo(competition);
        printCompetition(competition);
    }

    private Competition createCompetition() {
        System.out.println("Podaj nazwę zawodów:");
        String competitionName = scanner.nextLine();
        System.out.println("Podaj maksymalną liczbę uczestników:");
        int maxParticipants = readPositiveNumber();
        System.out.println("Podaj ograniczenie wiekowe:");
        int ageLimit = readPositiveNumber();
        return new Competition(competitionName, maxParticipants, ageLimit);
    }

    private void fillParticipantsInfo(Competition competition) {
        while (competition.hasFreeSpots()) {
            System.out.println("Dodaj nowego uczestnika");
            Participant participant = createParticipant();
            try {
                competition.addParticipant(participant);
            } catch (AgeViolationException e) {
                System.out.println("Nie dodano uczestnika, minimalny wiek: " + e.getAgeRequired());
            } catch (DuplicateException e) {
                System.out.println(
                        "Uczestnik o wskazanym identyfikatorze został już dodany do tych zawodów " + e.getParticipant()
                );
            } catch (MaxCompetitorsException e) {
                System.out.println("Nie dodano uczestnika. Maksymalna liczba uczestników to " + e.getMaxCompetitors());
            }
        }
    }

    private Participant createParticipant() {
        System.out.println("Podaj imię:");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = scanner.nextLine();
        System.out.println("Podaj id (np. pesel):");
        String id = scanner.nextLine();
        System.out.println("Podaj wiek:");
        int age = readPositiveNumber();
        return new Participant(firstName, lastName, id, age);
    }

    private void printCompetition(Competition competition) {
        System.out.println(competition.toString());
    }

    private int readPositiveNumber() {
        int number = -1;
        while (number < 0) {
            try {
                number = scanner.nextInt();
                if (number < 0)
                    System.out.println("Podana liczba musi być dodatnia");
            } catch (InputMismatchException e) {
                System.out.println("Musisz podać liczbę, spróbuj ponownie.");
            } finally {
                scanner.nextLine();
            }
        }
        return number;
    }
}