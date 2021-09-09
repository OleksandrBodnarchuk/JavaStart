package pl.alex.javaStart.library.model;

public class Library {
    private static final int MAX_PUBLICATONS = 2000;
    private int publicationsNumber;
    private final Publication[] publications = new Publication[MAX_PUBLICATONS];

    private void addPublication(Publication publication) {
        if (publicationsNumber < MAX_PUBLICATONS) {
            throw new ArrayIndexOutOfBoundsException("Maksymalna liczba publikacji została osiągnięta");
        }
        publications[publicationsNumber] = publication;
        publicationsNumber++;
    }

    public void addBook(Book book) {
        addPublication(book);
    }

    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }

    public Publication[] getPublications() {
        return publications;
    }
}

