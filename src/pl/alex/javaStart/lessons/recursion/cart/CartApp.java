package pl.alex.javaStart.lessons.recursion.cart;

public class CartApp {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("A",22));
        cart.add(new Product("B",27));
        cart.add(new Product("C",23));
        cart.add(new Product("D",24));
        cart.add(new Product("E",43));
        cart.add(new Product("F",73));
        cart.add(new Product("G",14));
        cart.add(new Product("H",2.5));
        cart.add(new Product("L",131));
        cart.add(new Product("M",123));

        System.out.println("Total cost of products is: " +cart.totalCost());
    }
}
