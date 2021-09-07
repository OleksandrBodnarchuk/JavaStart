package pl.alex.javaStart.lessons.equalsHashCode.computer.app;

import pl.alex.javaStart.lessons.equalsHashCode.computer.model.Computer;
import pl.alex.javaStart.lessons.equalsHashCode.computer.model.DataStore;

public class NotebookShop {
    public static void main(String[] args) {
        Computer computer = new Computer("ASUS", "K750I");
        Computer computer1 = new Computer("Aple", "McBook Air");
        Computer computer2 = new Computer("ASUS", "K750I");
        Computer computer3 = new Computer("Lenovo", "Idea Pad");
        Computer computer4 = new Computer("Aple", "McBook Air");
        DataStore dataStore = new DataStore();
        dataStore.add(computer);
        dataStore.add(computer1);
        dataStore.add(computer2);
        dataStore.add(computer3);
        dataStore.add(computer4);
        dataStore.checkAvailability(computer1);

        Computer[] computers = dataStore.getComputers();
        for (int i = 0; i < computers.length; i++) {
            System.out.println(i+". "+computers[i]);
        }
    }
}
