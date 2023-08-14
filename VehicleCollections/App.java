package VehicleCollections;

import VehicleCollections.Entities.ListVehicle;

public class App {
    public static void main(String[] args) {
        ListVehicle listVehicle = new ListVehicle();
        listVehicle.addVehicle("Ferrari", 2021,1.250);
        listVehicle.addVehicle("Palio", 2005,12.3250);
        listVehicle.addVehicle("Golf", 2002,14.260);
        listVehicle.addVehicle("Lamborghini", 2003,11.25000);
        listVehicle.addVehicle("Hornet", 2001,1.850);
        System.out.println(listVehicle.sortVehicleByYear());
    }   
}
