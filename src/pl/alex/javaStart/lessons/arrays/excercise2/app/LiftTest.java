package pl.alex.javaStart.lessons.arrays.excercise2.app;

import pl.alex.javaStart.lessons.arrays.excercise2.model.Lift;
import pl.alex.javaStart.lessons.arrays.excercise2.model.Person;

public class LiftTest {
    public static void main(String[] args) {
        Lift lift = new Lift();
        Person person1 = new Person(1,12);
        Person person2 = new Person(2,23);
        Person person3 = new Person(3,32);
        Person person4 = new Person(4,44);
        Person person5 = new Person(5,60);

        lift.addPerson(person1);
        lift.addPerson(person2);
        lift.addPerson(person3);
        lift.addPerson(person4);
        lift.addPerson(person5);

        lift.start();
        lift.personGotOut();
        lift.personGotOut();
        lift.personGotOut();
        lift.personGotOut();
        lift.personGotOut();
        lift.addPerson(person5);
        lift.start();
    }

}
