package entities;

public abstract class Vehicle{
    private String chassi;
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public abstract void start();
    public void checkFuel(){
        System.out.println("Checking the fuel");
    }
    public void checkGear(){
        System.out.println("Verifing the gear");
    }
}