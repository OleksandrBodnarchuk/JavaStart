package pl.alex.javaStart.lessons.lambda_functional.THREE;

import java.util.*;
import java.util.function.Consumer;

/* TODO:
            1. Stworzyc listę imion w losowej kolejności;
            2. Posortować w porządku rosnącym: Collections.sort() & String.compareToIgnoreCase()
            3. Wyświetl na ekranie.
         */
public class NamesApp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adam", "Sławomira", "Eleonora", "Boguchwała", "Genowefa", "Bernika",
                "Elfryda", "Izabella", "Ksenia", "Violetta", "Milena", "Franciszka", "Rozalia",
                "Natalia", "Kleopatra", "Aniceta", "Emila", "Benedykta", "Erika", "Urszula", "Cecyliana",
                "Jadwiga", "Sława", "Zyta", "Iza", "Amelia", "Marzanna", "Waleria", "Anna", "Józefa");
        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);
    }
}
