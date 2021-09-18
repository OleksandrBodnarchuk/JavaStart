package pl.alex.javaStart.lessons.generics;

public class Pair<T, V> {
    private final T t;
    private final V v;

    public Pair(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public void showInfo() {
        System.out.println("T: " + this.t + " | V: " + this.v);
    }


}
