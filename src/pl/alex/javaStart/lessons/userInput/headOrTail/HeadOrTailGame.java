package pl.alex.javaStart.lessons.userInput.headOrTail;

import java.util.Random;
import java.util.Scanner;


//        Napisz program "rzut monetą". Użytkownik powinien mieć możliwość wyboru jednej z dwóch opcji:
//
//        orzeł / awers (reprezentowana przez liczbę 1)
//        reszka / rewers (reprezentowana przez liczbę 0)

//        Poproś użytkownika o wybór, następnie zrób symulację rzutu monetą, poprzez wylosowanie liczby 0 lub 1.
//        Wyświetl użytkownikowi komunikat, czy jego wybór był trafny, czy nie. Jeżeli wybór był trafny, to w komunikacie uwzględnij to, czy wypadł orzeł, czy reszka.
//
//        Przykładowy wynik działania programu:

public class HeadOrTailGame {
    private final int HEAD = 1, TAIL = 0;
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    public void startGame(){
        System.out.println("Head or Tail?\n1. Head\n2. Tail");
        int choice = scanner.nextInt();
        scanner.nextLine();
        int toss = random.nextInt(2);
        if (choice==toss){
            System.out.println("You win!");
        } else if (choice<toss){
            System.out.println("Wrong, was Tail");
        } else {
            System.out.println("Wrong, was Head");
        }


    }


}
