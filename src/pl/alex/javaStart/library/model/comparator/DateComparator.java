package pl.alex.javaStart.library.model.comparator;

import pl.alex.javaStart.library.model.Publication;

import java.util.Comparator;

public class DateComparator implements Comparator<Publication> {
    @Override
    public int compare(Publication o1, Publication o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}
