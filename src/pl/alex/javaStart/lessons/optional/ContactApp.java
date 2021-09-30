package pl.alex.javaStart.lessons.optional;

import java.util.Optional;
import java.util.Scanner;

class ContactApp {
    public static void main(String[] args) {
        ContactReader
                .readFile("contacts.csv")
                .ifPresentOrElse(ContactApp::findByEmail, ContactApp::fileNotFoundMessage);

    }
    private static void findByEmail(ContactManager contactManager) {
        String email = getUserData();
        Optional<Contact> contactByEmail = contactManager.findByEmail(email);
        contactByEmail
                .ifPresentOrElse(ContactApp::showShortInfo,
                ContactApp::contactNotFoundMessage);

    }

    private static void showShortInfo(Contact contactByEmail) {
        System.out.println("Kontakt o wskazanym adresie email:");
        System.out.println(contactByEmail.getShortInfo());
    }

    private static void fileNotFoundMessage() {
        System.out.println(" - Brak pliku");
    }

    private static void contactNotFoundMessage() {
        System.out.print(" - Brak kontaktu");
    }


    private static String getUserData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        return scanner.nextLine();
    }
}