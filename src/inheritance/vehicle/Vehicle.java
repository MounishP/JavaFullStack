package inheritance.vehicle;

public class Vehicle {
    private String engine;
    private int wheels;
    private int seats;
    private int fuelTank;
    private String light;

    public Vehicle() {
        engine = "petrol";
        wheels = 4;
        seats = 4;
        fuelTank = 30;
        light = "LED";
    }

    public Vehicle(String engine, int wheels, int seats, int fuelTank, String light) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTank = fuelTank;
        this.light = light;
    }

    public String getEngine() {
        return engine;
    }


    public int getWheels() {
        return wheels;
    }


    public int getSeats() {
        return seats;
    }

    public int getFuelTank() {
        return fuelTank;
    }


    public String getLight() {
        return light;
    }

    public void run(){
        System.out.println("Vehicle running......");
    }

}
