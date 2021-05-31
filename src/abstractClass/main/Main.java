package abstractClass.main;

import abstractClass.food.NonVeg;
import abstractClass.person.Person;

public class Main {
    public static void main(String[] args) {
        Person mounish = new NonVeg();
        mounish.eat();
        mounish.speak();

    }
}
