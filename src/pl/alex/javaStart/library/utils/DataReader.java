package pl.alex.javaStart.library.utils;

import pl.alex.javaStart.library.model.Book;

import java.util.Scanner;

public class DataReader {
    private final Scanner scanner = new Scanner(System.in);

    public Book getDataAndCreateBook(){
        System.out.println("Title:");
        String title = scanner.nextLine();
        System.out.println("Author:");
        String author = scanner.nextLine();
        System.out.println("Release date:");
        int releaseDate = getInt();
        System.out.println("Number of pages:");
        int pages = getInt();
        System.out.println("Publisher:");
        String publisher = scanner.nextLine();
        System.out.println("ISBN:");
        String isbn = scanner.nextLine();
        scanner.close();
        return new Book(title,author,releaseDate,pages,publisher,isbn);
    }

    public int getInt() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
    public void close() {
        scanner.close();
    }

}
