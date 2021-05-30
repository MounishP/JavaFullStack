package InheritanceExercise.reptiles;

import InheritanceExercise.animals.Reptile;

public class Crocodile extends Reptile {
    public Crocodile() {
    }

    public Crocodile(String skin, boolean backbone, String eggs) {
        super(skin, backbone, eggs);
    }

    public Crocodile(double height, double weight, String animalType, String bloodType, String skin, boolean backbone, String eggs) {
        super(height, weight, animalType, bloodType, skin, backbone, eggs);
    }

    @Override
    public String showInfo() {
        return "Crocodile{} " + super.showInfo();
    }
}
