package classes;

public class Car {
    private String doors;
    private String engine;
    private String driver;
    private int speed;

    public Car(){
        doors = "closed";
        engine = "Diesel";
        driver = "not seated";
        speed = 0;
    }

    public Car(String doors, String engine, String driver, int speed) {
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    public Car(String doors, String engine, String driver) {
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDoors(){
        return doors;
    }

    public String getEngine() {
        return engine;
    }

    public String getDriver() {
        return driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void run(){
        if(doors.equals("closed")&& speed > 0 &&
                driver.equals("seated") && engine.equals("petrol")){
            System.out.println("Running...");
        }else{
            System.out.println("Not Running.....");
        }
    }
}
