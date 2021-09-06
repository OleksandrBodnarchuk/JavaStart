package pl.alex.javaStart.lessons.inheritance.courses;

public class OnlineBootcamp extends OnlineCourse{
    private Teacher teacher;
    private double consultationHours;

    public OnlineBootcamp(String name, String info, double price, int amountOfVideoMinutes, int amountOfMinutesToComplete, Teacher teacher) {
        super(name, info, price, amountOfVideoMinutes, amountOfMinutesToComplete);
        this.teacher = teacher;
        this.consultationHours = 5;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public double getConsultationHours() {
        return consultationHours;
    }
}
