package pl.alex.javaStart.lessons.constructors.Shop;

class Offer {
    Product product;
    double price;
    boolean special;

    public Offer(Product product, double price, boolean special) {
        this.product = product;
        this.price = price;
        this.special = special;
    }

    String printOfferInformation(){
        return this.product.name + " "
                + this.product.producer + " "
                + this.price + "zł, "
                + "oferta specjalna? " + this.special;
    }
}