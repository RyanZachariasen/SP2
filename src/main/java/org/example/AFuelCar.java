package org.example;

abstract class AFuelCar extends ACar {

    int kmPrLitre;
    public AFuelCar(int kmPrLitre){
        this.kmPrLitre=kmPrLitre;
    }

   abstract String getFuelType();
   abstract int kmPrLitre();
@Override
    public String toString(){
    return super.toString()+"\n"+" KM per litre: "+kmPrLitre();
}
}
