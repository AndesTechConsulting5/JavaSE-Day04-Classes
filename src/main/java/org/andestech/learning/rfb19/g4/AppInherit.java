package org.andestech.learning.rfb19.g4;

public class AppInherit
{

    private static String add(String st1, String st2)
    {return  st1 + st2; }

    private static double add(double st1, double st2)
    {return  st1 + st2; }

    private static double add(double st2)
    {return  st2+1; }

//    private static int add(int st1, int st2)
//    {
//        System.out.println("int called...");
//        return  st1 + st2; }








    public static void main( String[] args )
    {

        System.out.println( add(1,2));

     Truck truck = new Truck();
     Car car2 = new Truck();

     //Truck truck1 = (Truck) new Car();

     truck.drive();


     Object o2 = new SuperCar();

     SuperCar superCar = (SuperCar) o2;

     Car car = new Car();

     Object o = new Car();

        ( (Car) o).drive();





    }
}
