package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FleetOfCars fleetOfCars = new FleetOfCars();

        //cars
        GasonlineCar gasolinecar = new GasonlineCar(50,"NR206","opel","astra");
        DieselCar dieselcar = new DieselCar(10,"NR206","Toyota","Yaris",false);
        ElectricCar electriccar = new ElectricCar(78,450,"NR206","Tesla","Y");

        //adda cars
        fleetOfCars.addCars(gasolinecar);
        fleetOfCars.addCars(dieselcar);
        fleetOfCars.addCars(electriccar);

        //alt
        System.out.println(fleetOfCars);
        System.out.println(fleetOfCars.getTotalRegistrationFeeForFleet());
    }
}