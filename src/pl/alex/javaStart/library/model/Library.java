package pl.alex.javaStart.library.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;

public class Library implements Serializable {
    @Serial
    private static final long serialVersionUID = 5175276021013640213L;
    private int publicationsNumber;
    private Publication[] publications = new Publication[1];

    public void addPublication(Publication publication) {
        if (publicationsNumber == publications.length) {
            publications = Arrays.copyOf(publications, publications.length * 2);
        }
        publications[publicationsNumber] = publication;
        publicationsNumber++;
    }

    public boolean removePublication(Publication publication) {
        final int NOT_FOUND = -1;
        int found = NOT_FOUND;
        int counter = 0;

        while (counter < publications.length && found == NOT_FOUND) {
            if (publications[counter].equals(publication)) {
                found = counter;
            } else {
                counter++;
            }
        }
        // removing empty spaces from array
        if (found != NOT_FOUND) {
            System.arraycopy(publications, found + 1, publications, found, publications.length - found - 1);
            publicationsNumber--;
        }
        return found != NOT_FOUND;

    }

    public Publication[] getPublications() {
        Publication[] availablePublications = new Publication[publicationsNumber];
        System.arraycopy(publications, 0, availablePublications, 0, publicationsNumber);
        return availablePublications;
    }
}

