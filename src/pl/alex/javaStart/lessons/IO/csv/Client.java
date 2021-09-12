package pl.alex.javaStart.lessons.IO.csv;

public class Client {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String country;
    private final double value;

    public Client(int id, String firstName, String lastName, String country, double value) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.value = value;
    }

    public String getCountry() {
        return country;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append(": ");
        sb.append(firstName);
        sb.append(" ");
        sb.append(lastName);
        sb.append(", ");
        sb.append(country);
        sb.append(", ");
        sb.append(value);
        sb.append("z³");
        return sb.toString();
    }
}
