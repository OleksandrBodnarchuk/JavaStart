package pl.alex.javaStart.library.model;

public class Magazine extends Publication {
    private final int month;
    private final int day;
    private final String language;

    public Magazine(String title, String publisher, String language, int releaseDate, int month, int day ) {
        super(title, releaseDate, publisher);
        this.month = month;
        this.day = day;
        this.language = language;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getLanguage() {
        return language;
    }

    public void printInfo() {
        String info = getTitle() + "; " + getPublisher() + "; " + getReleaseDate() + "-"
                + month + "-" + day + "; " + language;
        System.out.println(info);
    }
}
