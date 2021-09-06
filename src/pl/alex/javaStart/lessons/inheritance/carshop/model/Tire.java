package pl.alex.javaStart.lessons.inheritance.carshop.model;



public class Tire extends Part {
    private final double size;
    private final double width;

    public Tire(int partId, String producentName, String model, String serialNumber, double size, double width) {
        super(partId, producentName, model, serialNumber);
        this.size = size;
        this.width = width;
    }

    public double getSize() {
        return size;
    }

    public double getWidth() {
        return width;
    }

    public void printInfo() {
        System.out.println(getSerialNumber() + ", " + getProducentName() + ", " + getModel() + ", " + getSerialNumber()
                + ", " + getSize() + ", " + getWidth());
    }
}
