package pl.alex.javaStart.lessons.auction;


public class Main {
    public static void main(String[] args) {
        Address address = new Address("Wroclaw", "Kosciuszki", "24A", 21, "50-500");
        Person person = new Person("Jan", "Kowalski", address);
        Auction auction1 = new Auction("Xbox One", "Konsola dla gier", 999.99, person);


        Person person2 = new Person("Justyna", "Adamczyk");
        Auction auction2 = new Auction("OnePlus9T", "Smartfon z kamera", 3999, person2);



        System.out.println("Dostępne aukcje");
        System.out.println(auction1.title + ", " + auction1.description + ", " + auction1.price + "zł, sprzedający: " +
                auction1.seller.firstName + " " + auction1.seller.lastName);
        System.out.println(auction2.title + ", " + auction2.description + ", " + auction2.price + "zł, sprzedający: " +
                auction2.seller.firstName + " " + auction2.seller.lastName);
    }
}
