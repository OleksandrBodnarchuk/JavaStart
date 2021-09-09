package pl.alex.javaStart.lessons.exceptions.competition.exceptions;

import pl.alex.javaStart.lessons.exceptions.competition.model.Participant;

public class DuplicateException extends RuntimeException {
    private Participant participant;

    public DuplicateException(Participant participant) {
        this.participant = participant;
    }

    public Participant getParticipant() {
        return participant;
    }
}