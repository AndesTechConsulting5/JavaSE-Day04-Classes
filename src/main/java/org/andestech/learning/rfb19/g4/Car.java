package org.andestech.learning.rfb19.g4;

public class Car extends Vehicle implements IDriveCheckable {

    double power;


    public Car(){
        this(1500,130);

        System.out.println("+++ctor Car: " + this);
        //...
    }

    public Car(double m, double power){

        this.m = m;
        this.power = power;
        System.out.println("+++ctor special Car: " + this);
        //...


    }

    public void ignit(){
        System.out.println("Car ignit!");

    }

    public void drive(){
        System.out.println("Car drive!");
        //...
        //...
    }

    public void stop(){
        System.out.println("Car stop!");
    };

    @Override
    public void checkPC() {
        System.out.println("CheckPC start...");
        //...

    }

    @Override
    boolean isTrailer() {
        return false;
    }
}
