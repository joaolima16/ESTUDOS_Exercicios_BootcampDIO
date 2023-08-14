package VehicleCollections.Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListVehicle {
    List<Vehicle> lsVehicles;

    public ListVehicle() {
        this.lsVehicles = new ArrayList<Vehicle>();
    }

    public void addVehicle(String name, int yearCreated, double value) {
        this.lsVehicles.add(new Vehicle(name, yearCreated, value));
    }
    public List<Vehicle> sortVehicleByYear(){
        List<Vehicle> lVehicleByYear = new ArrayList<>(lsVehicles);
        Collections.sort(lVehicleByYear, new OrdenationVehicles());
        return lVehicleByYear;
    }
}
