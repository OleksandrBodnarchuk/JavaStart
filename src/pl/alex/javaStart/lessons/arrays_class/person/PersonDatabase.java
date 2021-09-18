package pl.alex.javaStart.lessons.arrays_class.person;

import java.util.Arrays;

public class PersonDatabase {
    private Person[] people = new Person[1];
    private static int peopleAdded = 0;

    public void addPerson(Person person) {
        checkForNull(person);
        addAndExpand(person);

    }

    private void addAndExpand(Person person) {
        if (peopleAdded != people.length - 1) {
            this.people = Arrays.copyOf(people, peopleAdded * 2);
        }
        people[peopleAdded] = person;
        peopleAdded++;

    }

    public void remove(Person p) {
        checkForNull(p);
        int index = getPersonIndex(p);
        if (index > -1) {
            people[index] = null;
            peopleAdded--;
        }
        sortArray(index);
    }

    private void sortArray(int removedIndex) {
        while (people[removedIndex + 1] != null){
            people[removedIndex] = people[removedIndex + 1];
            removedIndex++;
        }
        people[peopleAdded]=null;
    }

    public Person get(int index) throws ArrayIndexOutOfBoundsException {
        return people[index - 1];
    }

    private void checkForNull(Person p) {
        if (p == null) {
            throw new NullPointerException("Null not allowed");
        }
    }

    private int getPersonIndex(Person p) {
        int index = -1;
        for (int i = 0; i < peopleAdded; i++) {
            if (people[i].equals(p)) {
                index = i;
            }
        }
        return index;
    }

    public void size() {
        int size = 0;
        for (Person person : people) {
            if (person != null) {
                size++;
            }
        }
        System.out.println("Size is " + size);
    }

    public Person[] getPeople() {
        return people;
    }
}
