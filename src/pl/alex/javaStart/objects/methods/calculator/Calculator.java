package pl.alex.javaStart.objects.methods.calculator;

public class Calculator {
    double a,b;


    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    void add(){
        System.out.println(a+b);
    }
    void subtract(){
        System.out.println(a-b);
    }
    void multiply(){
        System.out.println(a*b);
    }
    void divide(){
        System.out.println(a/b);
    }
}
