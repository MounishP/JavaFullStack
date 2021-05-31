package multiple.person;

import multiple.food.NonVeg;
import multiple.food.Veg;

public class Person implements Veg, NonVeg {
    @Override
    public void enjoy() {
        System.out.println("Yes!, I am");
    }

    @Override
    public void eat() {
        System.out.println("Yes!, I am");
    }
}
