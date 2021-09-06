package pl.alex.javaStart.lessons.inheritance.courses;

public class OnlineCourse extends Course{
    public final String COURSE_ID = "JAVA-ONLINE-123";
    private final int amountOfVideoMinutes;
    private final int amountOfMinutesToComplete;

    public OnlineCourse(String name, String info, double price, int amountOfVideoMinutes, int amountOfMinutesToComplete) {
        super(name, info, price);
        this.amountOfVideoMinutes = amountOfVideoMinutes;
        this.amountOfMinutesToComplete = amountOfMinutesToComplete;
    }

    public String getCOURSE_ID() {
        return COURSE_ID;
    }

    public int getAmountOfVideoMinutes() {
        return amountOfVideoMinutes;
    }

    public int getAmountOfMinutesToComplete() {
        return amountOfMinutesToComplete;
    }
}
