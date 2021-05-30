package InheritanceExercise.animals;

import InheritanceExercise.animal.Animal;

public class Bird extends Animal {
    private boolean feathers;
    private boolean fly;

    public Bird() {
        feathers = true;
        fly = true;
    }

    public Bird(boolean feathers, boolean fly) {
        this.feathers = feathers;
        this.fly = fly;
    }

    public Bird(double height, double weight, String animalType, String bloodType, boolean feathers, boolean fly) {
        super(height, weight, animalType, bloodType);
        this.feathers = feathers;
        this.fly = fly;
    }

    @Override
    public String showInfo() {
        return "Bird{" +
                "feathers=" + feathers +
                ", fly=" + fly +
                "} " + super.showInfo();
    }
}
