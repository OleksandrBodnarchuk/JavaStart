package pl.alex.javaStart.objects.methods.calculator;

public class Calculate {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(2.0, 5.0);
        calculator.add();
        calculator.subtract();
        calculator.multiply();
        calculator.divide();
    }
}
