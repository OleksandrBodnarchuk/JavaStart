package pl.alex.javaStart.lessons.bank;

public class Bank {

    public static void main(String[] args) {
        Address address = new Address("Warszawa","Chalubinskiego",12,43,"03-890");
        Person person = new Person("Jan", "Kowalski","9876543210",address);
        BankAccount account1 = new BankAccount(person,1000.00);
        Credit credit1 = new Credit(person,2000.00,100.50,0.05,12);

        System.out.println("Osoba:");
        System.out.println(person);
        System.out.println("Address: "+ person.address);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);

    }
}
