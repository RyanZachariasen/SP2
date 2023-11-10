package org.example;

public abstract class ACar implements Car {
    public String regNum;
    public String make;
    public String model;
    public final int numDoors = 4;
    public String getRegistrationNumber(){

        return regNum;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }

    final int getNumberOfDoors(int numDoors){
        return numDoors;
    }
    @Override
    public String toString(){
        return "Registration number:"+regNum+"\n"+" make: "+make+"\n"+" model: "+model+"\n"+" number of doors: "+numDoors+"\n"+"registration fee: "+getRegistratiationFee();
    }
}
