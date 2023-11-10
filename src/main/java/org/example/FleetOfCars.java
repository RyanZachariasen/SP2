package org.example;

import java.util.ArrayList;

public class FleetOfCars {
    int totalRegistrationFee;

    ArrayList<Car>fleet = new ArrayList<Car>();

    public void addCars(Car car){
        fleet.add(car);
    }
    @Override
    public String toString() {
        StringBuilder fleetDetails = new StringBuilder("Cars in the fleet:\n");
        for (Car car : fleet) {
            fleetDetails.append(car.toString()).append("\n"+" "+"\n");
        }
        return fleetDetails.toString();
    }
    public String getTotalRegistrationFeeForFleet() {
        for (Car car : fleet) {

            totalRegistrationFee += car.getRegistratiationFee();
        }

        return "Total registration fee for cars: "+totalRegistrationFee;
    }


}
