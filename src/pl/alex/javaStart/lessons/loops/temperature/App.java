package pl.alex.javaStart.lessons.loops.temperature;

import java.util.Locale;
import java.util.Scanner;

//Napisz program, który będzie symulował regulację temperatury pewnego pomieszczenia. Wczytaj od użytkownika dwie wartości:
//
//aktualną temperaturę,
//oczekiwaną temperaturę.
//Zakładamy, że obie wartości to liczby całkowite.
//
//Następnie, korzystając z pętli, stwórz symulację regulacji temperatury.
// W każdym przebiegu pętli temperatura aktualna powinna zbliżać się do temperatury docelowej o 0,5 stopnia Celsjusza.
// Jeżeli temperatura aktualna jest niższa od docelowej, to temperatura powinna wzrastać, natomiast jeżeli jest wyższa, to powinna maleć.
// Każdorazowo powinno to być potwierdzone wydrukiem w konsoli. Po osiągnięciu temperatury docelowej program powinien zakończyć swoje działanie.
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Wpisz aktualna temperature: ");
        int actual = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wpisz oczekiwana temperature: ");
        int expected = scanner.nextInt();
        scanner.nextLine();
        double temperature = actual;
        while (temperature<expected){
            System.out.println("Aktualna temperatura: "+temperature);
            temperature=temperature+0.5;
        }
        System.out.println("Osiagnieto temperatury: " + temperature+" stopni");

    }
}
