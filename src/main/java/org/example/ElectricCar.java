package org.example;

public class ElectricCar extends ACar{
    int batteryCapacity;
    int maxRange;


    public ElectricCar(int batteryCapacity, int maxRange,String regNum,String make,String model){
        this.batteryCapacity=batteryCapacity;
        this.maxRange=maxRange;
        this.regNum=regNum;
        this.make=make;
        this.model=model;
    }




    @Override
    public int getNumberOfDoors() {
        return 0;
    }


    public int getBatteryCapacityKWh(int batteryCapacity) {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public double getWhPrKm() {
        return ((double)batteryCapacity/maxRange)*1000;

    }

    @Override
    public int getRegistratiationFee() {
        double whPrKm = getWhPrKm();
        double kmPrL = 100/ (whPrKm/91.25);
        if(kmPrL>=20&&kmPrL>=50){
            return 330;
        }else if(kmPrL>=15&&kmPrL<=20){
            return 1050;
        }else if(kmPrL>=10&&kmPrL<=15){
            return 2340;
        }else if(kmPrL>=5&&kmPrL<=10){
            return 5500;
        }else{
            return 10470;
        }
    }
    public String toString(){
        return super.toString()+"\n"+" KM WH per KM: "+getWhPrKm();
    }

}
