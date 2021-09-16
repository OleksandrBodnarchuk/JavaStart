package pl.alex.javaStart.lessons.recursion.cart;

public class Cart {
    private final static int MAX_PRODUCTS = 10;
    private final Product[] products = new Product[MAX_PRODUCTS];
    private static int productsAdded = 0;

    public void add(Product product) {
        if (productsAdded < products.length) {
            products[productsAdded] = product;
            productsAdded++;
        } else {
            System.out.println("No space.");
        }
    }

    double totalCost() {
        return sumPrices(0);
    }

    private double sumPrices(int counter) {
        if (counter < (productsAdded - 1))
            return products[counter].getPrice() + sumPrices(++counter);
        else
            return products[counter].getPrice();
    }

    public Product[] getProducts() {
        return products;
    }


}
