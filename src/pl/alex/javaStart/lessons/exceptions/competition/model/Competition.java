package pl.alex.javaStart.lessons.exceptions.competition.model;


import pl.alex.javaStart.lessons.exceptions.competition.exceptions.AgeViolationException;
import pl.alex.javaStart.lessons.exceptions.competition.exceptions.DuplicateException;
import pl.alex.javaStart.lessons.exceptions.competition.exceptions.MaxCompetitorsException;

public class Competition {
    private String name;
    private Participant[] participants;
    private int ageLimit;
    private int size;

    public Competition(String name, int maxParticipants, int ageLimit) {
        this.name = name;
        if (ageLimit < 0)
            throw new IllegalArgumentException("ageLimit has to be positive number");
        this.ageLimit = ageLimit;
        this.participants = new Participant[maxParticipants];
    }

    public void addParticipant(Participant participant) throws MaxCompetitorsException {
        if (participant.getAge() < ageLimit)
            throw new AgeViolationException(ageLimit);
        if (participants.length == size)
            throw new MaxCompetitorsException(participants.length);
        checkDuplicate(participant);
        participants[size] = participant;
        size++;
    }

    private void checkDuplicate(Participant participant) {
        for (int i = 0; i < size; i++) {
            if (participants[i].getDocumentId().equals(participant.getDocumentId()))
                throw new DuplicateException(participant);
        }
    }

    public boolean hasFreeSpots() {
        return size < participants.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zawody ")
                .append(name)
                .append("\n")
                .append("Liczba uczestników: ").append(size);
        for (int i = 0; i < size; i++) {
            builder.append("\n");
            builder.append(" > ");
            builder.append(participants[i].toString());
        }
        return builder.toString();
    }
}