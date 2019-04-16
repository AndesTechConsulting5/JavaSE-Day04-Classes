package org.andestech.learning.rfb19.g4;

public class Truck extends Car {

    double trailerM, trailerLength;

    public Truck()
    {
        super(2000,150);
        System.out.println("+++ctor Truck: " + this);
    }

    @Override
    public void drive() {
       // super.drive();
        System.out.println("Truck drive!!!");
    }

    @Override
    boolean isTrailer() {
        return true;
    }
}
