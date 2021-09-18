package pl.alex.javaStart.lessons.arrays_class.person;

public class PersonApp {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        database.addPerson(new Person("1", "1","1"));
        database.addPerson(new Person("2", "2", "2"));
        database.addPerson(new Person("3", "3", "3"));
        database.addPerson(new Person("4", "4", "4"));
        database.addPerson(new Person("5", "5", "5"));
        database.addPerson(new Person("6", "6", "6"));

        database.remove(database.get(6));
        getInfo(database.getPeople());
        database.size();

    }

    private static void getInfo(Person[] person) {
        for (Person p : person) {
            System.out.println(p);
        }
    }
}
