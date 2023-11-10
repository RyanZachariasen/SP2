package org.example;

public class DieselCar extends AFuelCar {

    int partikelUdledningsAfgift = 1000;
boolean particleFilter = true;
    public DieselCar(int kmPrLitre,String regNum,String make,String model,boolean particleFilter) {
        super(kmPrLitre);
        this.kmPrLitre=kmPrLitre;
        this.regNum=regNum;
        this.make=make;
        this.model=model;
        this.particleFilter=particleFilter;
    }

    @Override
    String getFuelType() {
        return "Diesel";
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
    public int getNumberOfDoors() {
        return 0;
    }
    public boolean hasParticleFilter(){

        return particleFilter;
    }

    @Override
    public int getRegistratiationFee() {
        if(kmPrLitre>=20&&kmPrLitre<=50&&particleFilter){
            return 330+130;
        }else if(kmPrLitre>=15&&kmPrLitre<=20&&particleFilter){
            return 1050+1390;
        }else if(kmPrLitre>=10&&kmPrLitre<=15&&particleFilter){
            return 2340+1850;
        }else if(kmPrLitre>=5&&kmPrLitre<=10&&particleFilter){
            return 5500+2770;
        }/*else if (kmPrLitre<5&&particleFilter){
            return 10470+15260;
        }*/
        //!particlefilter
        else if(kmPrLitre>=20&&kmPrLitre<=50&&!particleFilter){
            return 330+130+partikelUdledningsAfgift;
        }else if(kmPrLitre>=15&&kmPrLitre<=20&&!particleFilter){
            return 1050+1390+partikelUdledningsAfgift;
        }else if(kmPrLitre>=10&&kmPrLitre<=15&&!particleFilter){
            return 2340+1850+partikelUdledningsAfgift;
        }else if(kmPrLitre>=5&&kmPrLitre<=10&&!particleFilter){
            return 5500+2770+partikelUdledningsAfgift;
        }else if(kmPrLitre<5&& !particleFilter){
            return 10470+15260+partikelUdledningsAfgift;
        }

        else {
            return 10470+15260;
        }
    }
    public String toString(){
        return super.toString()+"\n"+" Fuel Type: "+getFuelType()+"\n"+" has particle filter: "+hasParticleFilter();
    }

}
