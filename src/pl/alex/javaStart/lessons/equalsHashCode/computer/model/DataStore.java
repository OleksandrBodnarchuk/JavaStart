package pl.alex.javaStart.lessons.equalsHashCode.computer.model;

public class DataStore {
    private final int MAX_COMPUTERS = 100;
    private final Computer[] computers = new Computer[MAX_COMPUTERS];
    private static int computerAmount = 0;

    public void add(Computer computer) {
        if (computerAmount < computers.length) {
            computers[computerAmount] = computer;
            computerAmount++;
        } else {
            System.out.println("Not enough space!");
        }
    }

    public void checkAvailability(Computer computer) {
        int count = 1;
        for (Computer value : computers) {
            if (computer.equals(value)) {
                System.out.println(count + "." + computer);
                count++;
            }
        }
        if (count==1){
            System.out.println("Only one available.");
        }
    }

    public Computer[] getComputers() {
        Computer[] comps = new Computer[computerAmount];
        for (int i = 0; i < computerAmount; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }
}
