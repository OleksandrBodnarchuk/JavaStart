package pl.alex.javaStart.lessons.arrays.excercise2.model;

public class Lift {
    private final Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final double maxWeight = 400;

    public void addPerson(Person person) {
        if (peopleNumber < 4) {
            people[peopleNumber] = person;
            peopleNumber++;
        } else {
            System.out.println("Not enough space in the Lift!");
        }
    }

    public void start() {
        if (getPeopleWeight() > maxWeight) {
            System.out.println("Too many people in the Lift");
        } else {
            System.out.println("Lift has started.");
        }
    }

    public void personGotOut() {
        if (peopleNumber == 0) {
            System.out.println("Lift is empty");
            return;
        }
        people[peopleNumber-1] = null;
        System.out.println("Person got out");
        peopleNumber--;
    }

    public Person[] getPeople() {
        return people;
    }

    private double getPeopleWeight() {
        double weight = 0;
        for (Person p : people) {
            if (p != null) {
                weight += p.getWeight();
            }
        }
        return weight;
    }
}
