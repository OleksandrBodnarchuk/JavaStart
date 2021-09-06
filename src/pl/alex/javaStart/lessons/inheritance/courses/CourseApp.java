package pl.alex.javaStart.lessons.inheritance.courses;

public class CourseApp {
    public static void main(String[] args) {
        OnlineCourse online = new OnlineCourse("Kurs JavaStart Online", "Najlepszy kurs programowania w Javie",
                299, 600, 1200);
        System.out.println("Informacje o kursie " + online.getName());
        System.out.println("Opis: " + online.getInfo());
        System.out.println("Cena: " + online.getPrice() + "zł");
        System.out.println("Identyfikator: " + online.COURSE_ID);
        System.out.println("Czas filmów w kursie: " + online.getAmountOfVideoMinutes() + "min");
        System.out.println("Czas potrzebny na przerobienie: " + online.getAmountOfMinutesToComplete() + "min");
    }
}
