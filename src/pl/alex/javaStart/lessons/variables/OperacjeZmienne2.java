package pl.alex.javaStart.lessons.variables;

public class OperacjeZmienne2 {
    public static void main(String[] args) {
        final double VAT = 0.23;
        double chlebNetto = 100;
        double clebBrutto = chlebNetto+(chlebNetto*VAT);
        System.out.printf("Cena chlebu netto to: %.3f \nCena chlebu brutto to: %.3f",chlebNetto,clebBrutto);
    }
}
