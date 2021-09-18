package pl.alex.javaStart.library.model.comparator;

import pl.alex.javaStart.library.model.Publication;

import java.util.Comparator;

public class AlphabeticalTitleComparator implements Comparator<Publication> {
    @Override
    public int compare(Publication o1, Publication o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
