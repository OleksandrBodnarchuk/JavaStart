package pl.alex.javaStart.library.model;

import pl.alex.javaStart.library.model.Book;

public class Library {
    private final static int MAX_BOOKS = 1000;
    private final static int MAX_MAGAZINES = 1000;
    private final Book[] books = new Book[MAX_BOOKS];
    private final Magazine[] magazines = new Magazine[MAX_MAGAZINES];
    private int booksNumber;
    private int magazinesNumber;

    public void addBook(Book book) {
        if(booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Maksymalna liczba książek została osiągnięta");
        }

    }

    public void addMagazine(Magazine magazine) {
        if(booksNumber < MAX_MAGAZINES) {
         magazines[magazinesNumber] = magazine;
            magazinesNumber++;
        } else {
            System.out.println("Maksymalna liczba książek została osiągnięta");
        }

    }

    public void printBooks() {
        if(booksNumber == 0) {
            System.out.println("Brak książek w bibliotece");
        }
        for(int i=0; i<booksNumber; i++) {
            books[i].printInfo();
        }
    }

    public void printMagazines() {
        if(magazinesNumber == 0) {
            System.out.println("Brak magazynów w bibliotece");
        }
        for(int i=0; i<magazinesNumber; i++) {
            magazines[i].printInfo();
        }
    }
}

