package org.andestech.learning.rfb19.g4;

public class Car {

    double m, power;


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

    void ignit(){
        System.out.println("Car ignit!");

    }

    void drive(){
        System.out.println("Car drive!");
        //...
        //...
    }

    void stop(){
        System.out.println("Car stop!");
    };

}
