package pl.alex.javaStart.lessons.inheritance.carshop.model;

public class ExhaustPart extends  Part{
    private final boolean isEURO6;

    public ExhaustPart(int partId, String producentName, String model, String serialNumber, boolean isEURO6) {
        super(partId, producentName, model, serialNumber);
        this.isEURO6 = isEURO6;
    }

    public boolean isEURO6() {
        return isEURO6;
    }

    public void printInfo() {
        System.out.println(getSerialNumber() + ", " + getProducentName() + ", " + getModel() + ", " + getSerialNumber()
                + ", EURO6: " +isEURO6());
    }



}
