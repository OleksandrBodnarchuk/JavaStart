package pl.alex.javaStart.lessons.bank;

public class BankAccount {
    Person person;
    double balance;

    public BankAccount(Person person, double amount) {
        this.person = person;
        this.balance = amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "person=" + person +
                ", balance=" + balance +
                '}';
    }
}
