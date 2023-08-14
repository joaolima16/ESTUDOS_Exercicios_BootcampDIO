package VehicleCollections.Entities;

import java.util.Comparator;

public class OrdenationVehicles implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return Integer.compare(v1.getYearCreated(), v2.getYearCreated());
    }
    
}
