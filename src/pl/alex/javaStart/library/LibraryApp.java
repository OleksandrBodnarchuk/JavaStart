package pl.alex.javaStart.library;

import pl.alex.javaStart.library.utils.LibraryControl;

public class LibraryApp {
    private static final String APP_NAME = "Library v1.0";
    public static void main(String[] args) {
        System.out.println(APP_NAME);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();
    }
}
