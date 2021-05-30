package InheritanceExercise.birds;

import InheritanceExercise.animals.Bird;

public class Eagle extends Bird {
    public Eagle() {
    }

    public Eagle(boolean feathers, boolean fly) {
        super(feathers, fly);
    }

    public Eagle(double height, double weight, String animalType, String bloodType, boolean feathers, boolean fly) {
        super(height, weight, animalType, bloodType, feathers, fly);
    }

    @Override
    public String showInfo() {
        return "Eagle{} " + super.showInfo();
    }
}
