package pl.alex.javaStart.lessons.generics;

public class PairApp {
    public static void main(String[] args) {
        Pair<Integer,String> pair1 = new Pair<>(1,"One");
        Pair<Double, Boolean> pair2 =  new Pair<>(2.45,false);
        Pair<String, String> pair3 = new Pair<>("pair3","pairString");

        pair1.showInfo();
        pair2.showInfo();
        pair3.showInfo();

    }
}
