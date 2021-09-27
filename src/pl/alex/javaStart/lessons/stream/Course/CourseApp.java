package pl.alex.javaStart.lessons.stream.Course;


import java.util.Comparator;
import java.util.stream.Stream;

public class CourseApp {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Java od podstaw", 159, "Programowanie"),
                new Course(4L, "Tajniki Google", 299, "Marketing")
        );
        Stream<Course> cheap = courses
                .sorted(Comparator.comparing(Course::getPrice))
                .skip(2);
        cheap.forEach(System.out::println);
    }

    private static void printLine(String s) {
        System.out.println(s);
    }
}
