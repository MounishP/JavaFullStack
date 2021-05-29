package inheritance.vehicles;

import inheritance.vehicle.Vehicle;

public class Bike extends Vehicle {
    private String handle;

    public Bike(){
        super();
        handle = "long";
    }

    public Bike(String handle) {
        super();
        this.handle = handle;
    }

    public Bike(String engine, int wheels, int seats, int fuelTank, String light, String handle) {
        super(engine, wheels, seats, fuelTank, light);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' +
                ", engine='" +getEngine() + '\'' +
                ", wheels=" + getWheels() +
                ", seats=" + getSeats() +
                ", fuelTank=" + getFuelTank() +
                ", light='" + getLight() + '\'' +
                '}';
    }

    public void run(){
        System.out.println("Bike is running.......");
    }
}
