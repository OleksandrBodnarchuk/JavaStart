package pl.alex.javaStart.lessons.staticc.Student;

public class University {
    public static void main(String[] args) {
        Student student1 = new Student("Alex","Bod");
        Student student2 = new Student("Alina","Her");

        System.out.println("Number of students: " + Student.NUMBER_OF_STUDENTS);
        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());
    }
}
