package pl.alex.javaStart.library.model;

public class Magazine extends Publication {
    private final int month;
    private final int day;
    private final String language;

    public Magazine(String title, String publisher, int year, int month, int day, String language) {
        super(title, publisher, year);
        this.month = month;
        this.day = day;
        this.language = language;
    }

    void printInfo() {
        String info = getTitle() + "; " + getPublisher() + "; " + getYear() + "-"
                + this.month + "-" + this.day + "; " + this.language;
        System.out.println(info);
    }
}
