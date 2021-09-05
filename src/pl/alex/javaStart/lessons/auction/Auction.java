package pl.alex.javaStart.lessons.auction;



public class Auction {
    String title;
    String description;
    double price;
    Person seller;

    public Auction(String title, String description, double price, Person seller) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.seller = seller;
    }
}
