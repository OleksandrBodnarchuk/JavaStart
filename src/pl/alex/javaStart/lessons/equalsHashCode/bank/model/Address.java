package pl.alex.javaStart.lessons.equalsHashCode.bank.model;

public class Address {
    private String city;
    private String street;
    private String postalCode;
    private String homeNo;
    private String flatNo;

    public Address(String city, String street, String postalCode, String homeNo, String flatNo) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
    }

}
