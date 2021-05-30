package InheritanceExercise.fishes;

import InheritanceExercise.animals.Fish;

public class Eel extends Fish {
    private boolean electricCharge;

    public Eel() {
        electricCharge = true;
    }

    public Eel(boolean electricCharge) {
        this.electricCharge = electricCharge;
    }

    public Eel(String livesIn, boolean gills, boolean electricCharge) {
        super(livesIn, gills);
        this.electricCharge = electricCharge;
    }

    public Eel(double height, double weight, String animalType, String bloodType, String livesIn, boolean gills, boolean electricCharge) {
        super(height, weight, animalType, bloodType, livesIn, gills);
        this.electricCharge = electricCharge;
    }

    @Override
    public String showInfo() {
        return "Eel{" +
                "electricCharge=" + electricCharge +
                "} " + super.showInfo();
    }
}
