package pl.alex.javaStart.library.model;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LibraryUser extends User implements CsvConvertible {
    @Serial
    private static final long serialVersionUID = 6499244023532888258L;
    private final List<Publication> publicationHistory = new ArrayList<>();
    private final List<Publication> borrowedPublications = new ArrayList<>();

    public LibraryUser(String name, String surname, String PESEL) {
        super(name, surname, PESEL);
    }

    @Override
    public String toCsv() {
        return getName() + ";" + getSurname() + ";" + getPESEL();
    }

    public List<Publication> getPublicationHistory() {
        return publicationHistory;
    }

    public List<Publication> getBorrowedPublications() {
        return borrowedPublications;
    }

    private void addPublicationToHistory(Publication publication) {
        publicationHistory.add(publication);
    }

    public void borrowPublication(Publication publication) {
        borrowedPublications.add(publication);
    }

    public boolean returnPublication(Publication publication) {
        boolean flag = false;
        if (borrowedPublications.contains(publication)) {
            borrowedPublications.remove(publication);
            addPublicationToHistory(publication);
            flag = true;
        }
        return flag;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(publicationHistory, that.publicationHistory) && Objects.equals(borrowedPublications, that.borrowedPublications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), publicationHistory, borrowedPublications);
    }
}
