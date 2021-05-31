package abstractClass.food;

import abstractClass.person.Person;

public class NonVeg extends Person {
    @Override
    public void eat() {
        System.out.println("eats Non-Veg");
    }
}
