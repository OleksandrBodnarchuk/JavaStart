package pl.alex.javaStart.library.model;

import java.io.Serializable;

public class Library implements Serializable {
    private static final int MAX_PUBLICATONS = 2000;
    private int publicationsNumber;
    private final Publication[] publications = new Publication[MAX_PUBLICATONS];

    public void addPublication(Publication publication) {
        if (publicationsNumber >= MAX_PUBLICATONS) {
            throw new ArrayIndexOutOfBoundsException("Maksymalna liczba publikacji została osiągnięta");
        }
        publications[publicationsNumber] = publication;
        publicationsNumber++;
    }

    public Publication[] getPublications() {
        Publication[] availablePublications = new Publication[publicationsNumber];
        System.arraycopy(publications, 0, availablePublications, 0, publicationsNumber);
        return availablePublications;
    }
}

