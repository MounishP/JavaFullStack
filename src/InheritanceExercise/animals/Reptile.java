package InheritanceExercise.animals;

import InheritanceExercise.animal.Animal;

public class Reptile extends Animal {
    private String skin;
    private boolean backbone;
    private String eggs;

    public Reptile() {
        skin = "Dry Skin";
        backbone = true;
        eggs = "Soft shell eggs";
    }

    public Reptile(String skin, boolean backbone, String eggs) {
        this.skin = skin;
        this.backbone = backbone;
        this.eggs = eggs;
    }

    public Reptile(double height, double weight, String animalType, String bloodType, String skin, boolean backbone, String eggs) {
        super(height, weight, animalType, bloodType);
        this.skin = skin;
        this.backbone = backbone;
        this.eggs = eggs;
    }

    @Override
    public String showInfo() {
        return "Reptile{" +
                "skin='" + skin + '\'' +
                ", backbone=" + backbone +
                ", eggs='" + eggs + '\'' +
                "} " + super.showInfo();
    }
}
