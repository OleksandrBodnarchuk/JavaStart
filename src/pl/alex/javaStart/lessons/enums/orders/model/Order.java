package pl.alex.javaStart.lessons.enums.orders.model;

public class Order {
    private final String item;
    private final double price;
    private final Status status;

    public Order(String item, double price, Status status) {
        this.item = item;
        this.price = price;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return item + " (" + price + "zł) - " + status;
    }
}
