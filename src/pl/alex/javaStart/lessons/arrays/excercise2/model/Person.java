package pl.alex.javaStart.lessons.arrays.excercise2.model;

public class Person {
    private int personId;
    private final double weight;

    public Person(int personId, double weight) {
        this.personId = personId;
        this.weight = weight;
    }

    public int getPersonId() {
        return personId;
    }

    public double getWeight() {
        return weight;
    }
}
