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


    private static void fullTest(IDriveCheckable  car)
    {
        // check board Computer
        car.checkPC();
        // start
        car.ignit();
        //...
        car.drive();
        //..
        car.stop();
}

    private static void fullTest2(Object  car0)
    {
        // check board Computer
        //IDriveCheckable car = (IDriveCheckable)car0;
        Car car = null;
        if (car0 instanceof Car){

        car = (Car)car0;}
        else{
            System.out.println("Wrong type: " + car0);
            return;
        }


        car.checkPC();
        // start
        car.ignit();
        //...
        car.drive();
        //..
        car.stop();
    }





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

        System.out.println("----------------------");
     fullTest(car);
     fullTest(superCar);
     fullTest(truck);

        System.out.println("-------------------------");

     fullTest2(truck);
     fullTest2(new Account(new Customer("aa","bb","address"),2222));
     fullTest2(2137987);
     fullTest2("qeywii");


     IDrivable drivable = new SuperCar();
     drivable.drive();

     Vehicle vehicle;



    }
}
