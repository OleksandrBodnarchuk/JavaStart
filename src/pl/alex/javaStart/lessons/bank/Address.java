package pl.alex.javaStart.lessons.bank;

public class Address {
    String city;
    String street;
    int houseNumber;
    int apartment;
    String postCode;

    public Address(String city, String street, int houseNumber, int apartment, String postCode) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartment = apartment;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return city +
                ", ul." + street +
                " "+houseNumber + "\\"+
                apartment +
                ", " + postCode;
    }
}
