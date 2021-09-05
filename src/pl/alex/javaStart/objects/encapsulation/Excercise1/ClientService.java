package pl.alex.javaStart.objects.encapsulation.Excercise1;

public class ClientService {

    public void printClientDiscountInfo(Client client, double discountedPrice, double originalPrice) {
        System.out.println(printWelcomeMessage(client));
        System.out.println(getInformationOnPrice(originalPrice, discountedPrice));
    }

    private String getInformationOnPrice(double originalPrice, double discountedPrice) {
        return "Kwota przed rabatem: " + originalPrice +
                "\nDo zapłaty (po rabacie): " + discountedPrice;
    }


    private String printWelcomeMessage(Client client) {
        String info;
        if (client.getName() == null && client.getSurname() == null) {
            info = "Witaj nieznajomy";
        } else if (client.getSurname() == null) {
            info = "Witaj " + client.getName();
        } else if (client.getName() == null) {
            info = "Dzień dobry panie/pani " + client.getSurname();
        } else {
            info = "Witaj " + client.getName() + " " + client.getSurname();
        }
        return info;
    }

}
