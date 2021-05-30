package InheritanceExercise.animals;

import InheritanceExercise.animal.Animal;

public class Fish extends Animal {
    private String livesIn;
    private boolean gills;

    public Fish() {
        livesIn = "water";
        gills = true;
    }

    public Fish(String livesIn, boolean gills) {
        this.livesIn = livesIn;
        this.gills = gills;
    }

    public Fish(double height, double weight, String animalType, String bloodType, String livesIn, boolean gills) {
        super(height, weight, animalType, bloodType);
        this.livesIn = livesIn;
        this.gills = gills;
    }

    @Override
    public String showInfo() {
        return "Fish{" +
                "livesIn='" + livesIn + '\'' +
                ", gills=" + gills +
                "} " + super.showInfo();
    }
}
