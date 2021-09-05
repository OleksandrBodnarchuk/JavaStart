package pl.alex.javaStart.objects.encapsulation.Excercise1;

public class DiscountService {

    public double calculateDiscountPrice(Client client, double price){
        if (client.isPremium()){
            return calculatePremiumPrice(price);
        } else {
            return calculateStandardPrice(price);
        }
    }



    private double calculateStandardPrice(double price) {
        if (price>1000){
            return applyDiscount(price,0.10);
        } else{
            return price;
        }
    }


    private double calculatePremiumPrice(double price) {
        if (price>1000){
            return applyDiscount(price,0.15);
        } else{
            return applyDiscount(price, 0.05);
        }
    }

    private double applyDiscount(double price, double discount) {
        return price*(1-discount);
    }
}
