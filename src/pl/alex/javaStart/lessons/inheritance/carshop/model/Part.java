package pl.alex.javaStart.lessons.inheritance.carshop.model;

public class Part {
    private final int partId;
    private final String producentName;
    private final String model;
    private final String serialNumber;

    public Part(int partId, String producentName, String model, String serialNumber) {
        this.partId = partId;
        this.producentName = producentName;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public int getPartId() {
        return partId;
    }

    public String getProducentName() {
        return producentName;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }


}
