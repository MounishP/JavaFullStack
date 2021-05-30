package InheritanceExercise.main;

import InheritanceExercise.animal.Animal;
import InheritanceExercise.animals.Fish;
import InheritanceExercise.birds.Eagle;
import InheritanceExercise.fishes.Eel;
import InheritanceExercise.reptiles.Crocodile;

public class Main {
    public static void main(String[] args){
        Animal croc = new Crocodile(1.3,70,"Reptile","animal","Dry Skin",
                true,"Hard-shell eggs");
        System.out.println(croc.showInfo());

        Animal eagle = new Eagle(2,4,"Bird","animal",true,true);
        System.out.println(eagle.showInfo());

        Animal eel = new Eel(0.2,2,"Fish","animal","water",true,true);
        System.out.println(eel.showInfo());

        Animal shark = new Fish(8,120,"Fish","red blood","water",true);
        System.out.println("Shark: " + shark.showInfo());
    }
}
