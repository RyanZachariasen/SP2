package org.example;

public class GasonlineCar extends AFuelCar {


    public GasonlineCar(int kmPrLitre,String regNum,String make,String model) {
        super(kmPrLitre);
        this.kmPrLitre=kmPrLitre;
        this.regNum=regNum;
        this.make=make;
        this.model=model;
    }


    @Override
    String getFuelType() {
        return "Gasoline";
    }



    @Override
    int kmPrLitre() {
        return kmPrLitre;
    }


    @Override
    public String getRegistrationNumber() {

        return regNum;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors(){
        return 4;
    }


    @Override
    public int getRegistratiationFee() {
        if(kmPrLitre>=20&&kmPrLitre<=50){
            return 330;
        }else if(kmPrLitre>=15&&kmPrLitre<=20){
        return 1050;
        }else if(kmPrLitre>=10&&kmPrLitre<=15){
            return 2340;
        }else if(kmPrLitre>=5&&kmPrLitre<=10){
            return 5500;
        }else{
            return 10470;
        }
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+" fuel type:"+getFuelType();
    }
}
