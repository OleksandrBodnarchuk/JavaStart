package pl.alex.javaStart.objects.variables;

import java.util.Random;

public class OperacjeZmienne1 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(100);
        int y = random.nextInt(100);
        boolean xBiggerY = x > y;
        boolean xTime2BiggerY = (x * 2) > y;
        boolean yLessXPlus3 = y < (x + 3) && y > (x / 2);
        boolean even = x % y == 0;
        System.out.printf("x = %d\ty = %d\n", x, y);
        System.out.println("Czy x jest większe od y? - " + xBiggerY);
        System.out.println("Czy x pomnożone przez 2 jest większe od y?) - " + xTime2BiggerY);
        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2? - " + yLessXPlus3);
        System.out.println("Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo) - " + even);
    }
}
