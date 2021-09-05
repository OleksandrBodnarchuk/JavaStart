package pl.alex.javaStart.lessons.loops.hospital;

//       Napisz program symulujący system do planowania wizyt w szpitalu. Program powinien składać się z trzech klas:
//
//        Patient - klasa przechowująca dane o pacjencie (imię, nazwisko, PESEL). Klasa powinna być zgodna z konwencją JavaBeans,
//        Hospital - klasa z logiką aplikacji umożliwiająca dopisanie pacjenta do kolejki oraz wyświetlenie wszystkich zapisanych pacjentów,
//        HospitalApp - klasa startowa programu, która posiada trzy opcje: 0 - wyjście z programu, 1 - dopisanie pacjenta, 2 - wyświetlenie listy zapisanych pacjentów.
//        Ograniczenia:
//
//        Do szpitala może zapisać się co najwyżej 10 pacjentów, przy próbie zapisania kolejnego wyświetlana jest informacja o tym, że limit został już wyczerpany.
//        Aplikacja powinna działać do tego momentu, aż użytkownik nie wybierze opcji 0, czyli wyjścia z programu.

import pl.alex.javaStart.lessons.loops.hospital.model.Hospital;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;
        Scanner input = new Scanner(System.in);
        int option = -1;

        Hospital hospital = new Hospital();

        while (option != exit) {
            System.out.println("Dostępne opcje: ");
            System.out.println("0 - wyjście z programu");
            System.out.println("1 - dodanie pacjenta");
            System.out.println("2 - wyświetlenie listy pacjentów");

            System.out.println("Wybierz opcję: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case addPatient:
                    hospital.createAndAddPatient();
                    break;
                case printPatients:
                    hospital.printPatientList();
                    break;
                case exit:
                    System.out.println("Zamykam program!");
                    break;
                default:
                    System.out.println("Nie znaleziono takiej opcji");
            }
        }

        input.close();
    }
}

