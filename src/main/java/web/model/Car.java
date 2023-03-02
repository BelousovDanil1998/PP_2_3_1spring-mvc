package web.model;

public class Car {
    private String name;
    private int serialNumber;
    private int yearCreation;

    public Car(String name, int serialNumber, int yearCreation) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.yearCreation = yearCreation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getYearCreation() {
        return yearCreation;
    }

    public void setYearCreation(int yearCreation) {
        this.yearCreation = yearCreation;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", serialNumber=" + serialNumber +
                ", yearCreation=" + yearCreation +
                '}';
    }
}
