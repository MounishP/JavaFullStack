package inheritance.main;

import inheritance.vehicles.Bike;

public class Demo {
    public static void main(String[] args){
        Bike bike = new Bike("petrol",2,2,10,"Neon","short");
//        System.out.println(bike.getWheels());
//        System.out.println(bike.getSeats());
//        System.out.println(bike.getLight());
//        System.out.println(bike.getEngine());
//        System.out.println(bike.getFuelTank());
//        System.out.println(bike.getHandle());
        bike.run();
    }
}
