package abstractClass.food;

import abstractClass.person.Person;

public class Veg extends Person {

    @Override
    public void eat() {
        System.out.println("Eats only veg");
    }
}
