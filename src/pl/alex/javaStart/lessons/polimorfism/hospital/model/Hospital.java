package pl.alex.javaStart.lessons.polimorfism.hospital.model;

public class Hospital {
    private final Person[] people = new Person[3];
    private static int peopleCount=0;

    public void addPerson(Person person){
        if (peopleCount<people.length){
            people[peopleCount] = person;
            peopleCount++;
        } else {
            System.out.println("No more vacancies.");
        }

    }

    public void getInfo(){
        for(Person p : people){
            System.out.println(p);
        }
    }
}
