package pl.alex.javaStart.lessons.equalsHashCode.bank.app;

import pl.alex.javaStart.lessons.equalsHashCode.bank.model.Address;
import pl.alex.javaStart.lessons.equalsHashCode.bank.model.BankAccount;
import pl.alex.javaStart.lessons.equalsHashCode.bank.model.Client;

public class BankTest {
    public static void main(String[] args) {
        Address address1 = new Address("Wrocław", "Hubska", "50-123", "23A", "15");
        Client client1 = new Client("Jan", "Kowalski", "88061056273", address1);
        BankAccount account1 = new BankAccount("32 2222 5673 8901 3232 4786 0001", client1, 2019);

        Address address2 = new Address("Wrocław", "Hubska", "50-123", "23A", "15");
        Client client2 = new Client("Jan", "Kowalski", "88061056273", address2);
        BankAccount account2 = new BankAccount("32 2222 5673 8901 3232 4786 0001", client2, 2019);

        if (account1.equals(account2)) {
            System.out.println("Konta bankowe są identyczne");
        } else {
            System.out.println("Konta bankowe są różne");
        }
    }
}
