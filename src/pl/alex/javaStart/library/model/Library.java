package pl.alex.javaStart.library.model;

import pl.alex.javaStart.library.exceptions.PublicationAlreadyExistsException;
import pl.alex.javaStart.library.exceptions.UserAlreadyExistsException;

import java.io.Serial;
import java.io.Serializable;
import java.util.*;

public class Library implements Serializable {
    @Serial
    private static final long serialVersionUID = 5175276021013640213L;
    private final Map<String, Publication> publications = new HashMap<>();
    private final Map<String, LibraryUser> users = new HashMap<>();

    public void addPublication(Publication publication) {
        if (publications.containsKey(publication.getTitle())) {
            throw new PublicationAlreadyExistsException("Publikacja już istnieje!");
        }
        publications.put(publication.getTitle(), publication);
    }

    public void addUser(LibraryUser user) {
        if (users.containsKey(user.getPESEL())) {
            throw new UserAlreadyExistsException("Użytkownik już istnieje!");
        }
        users.put(user.getPESEL(), user);
    }

    public boolean removePublication(Publication publication) {
        boolean result = false;
        if (publications.containsValue(publication)) {
            publications.remove(publication.getTitle());
            result = true;
        }
        return result;
    }

    public Collection<Publication> getSortedPublications(Comparator<Publication> publicationComparator) {
        ArrayList<Publication> publications = new ArrayList<>(this.publications.values());
        publications.sort(publicationComparator);
        return publications;
    }

    public Collection<LibraryUser> getSortedUsers(Comparator<User> userComparator) {
        ArrayList<LibraryUser> users = new ArrayList<>(this.users.values());
        users.sort(userComparator);
        return users;
    }

    public Map<String, Publication> getPublications() {
        return publications;
    }

    public Map<String, LibraryUser> getUsers() {
        return users;
    }
}

