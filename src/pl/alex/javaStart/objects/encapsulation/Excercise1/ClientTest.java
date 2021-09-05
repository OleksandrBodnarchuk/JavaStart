package pl.alex.javaStart.objects.encapsulation.Excercise1;

public class ClientTest {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", true);
        double price1 = 1100;

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;

        Client client3 = new Client(null, "Nowak", false);
        double price3 = 900;

        Client client4 = new Client("Karol", null, false);
        double price4 = 1200;

        Client client5 = new Client(null, null, false);
        double price5 = 3000;


        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);
        double priceDiscount3 = discountService.calculateDiscountPrice(client3, price3);
        double priceDiscount4 = discountService.calculateDiscountPrice(client4, price4);
        double priceDiscount5 = discountService.calculateDiscountPrice(client5, price5);

        ClientService clientService = new ClientService();
        clientService.printClientDiscountInfo(client1, price1, priceDiscount1);
        clientService.printClientDiscountInfo(client2, price2, priceDiscount2);
        clientService.printClientDiscountInfo(client3, price3, priceDiscount3);
        clientService.printClientDiscountInfo(client4, price4, priceDiscount4);
        clientService.printClientDiscountInfo(client5, price5, priceDiscount5);
    }
}
