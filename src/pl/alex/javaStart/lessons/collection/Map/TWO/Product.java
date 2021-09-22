package pl.alex.javaStart.lessons.collection.Map.TWO;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private final String name;
    private final double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return name + " :" + price;
    }

    @Override
    public int compareTo(Product p) {
        return Double.compare(this.price,p.price);
    }
}
