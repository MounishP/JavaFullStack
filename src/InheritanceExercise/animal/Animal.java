package InheritanceExercise.animal;

public class Animal {
    private double height;
    private double weight;
    private String animalType;
    private String bloodType;

    public Animal() {
        height = 0;
        weight = 0;
        animalType = "";
        bloodType = "";
    }

    public Animal(double height, double weight, String animalType, String bloodType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }

    public String showInfo() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
