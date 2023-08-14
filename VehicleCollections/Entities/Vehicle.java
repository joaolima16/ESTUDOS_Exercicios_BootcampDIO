package VehicleCollections.Entities;

public class Vehicle {
    private String name;
    private int yearCreated;
    private double value;
    @Override
    public String toString() {
        return "Vehicle [name=" + name + ", yearCreated=" + yearCreated + ", value=$" + value + "]";
    }
    public Vehicle(String name, int yearCreated, double value) {
        this.name = name;
        this.yearCreated = yearCreated;
        this.value = value;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYearCreated() {
        return yearCreated;
    }
    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
}
