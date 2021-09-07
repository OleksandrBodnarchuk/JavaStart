package pl.alex.javaStart.lessons.enums.orders.model;

public enum Status {
    NEW("NOWE"),
    PAID("OPŁACONE"),
    SHIPPED("WYSŁANE"),
    DELIVERED("DOSTARCZONE"),
    CANCELLED("ANULOWANE");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}
