package composition.main;

import composition.laptop.Laptop;
import composition.laptopcomponents.GraphicsCard;
import composition.laptopcomponents.Processor;

public class Composition {
    public static void main(String[] args){
        Laptop gamingLaptop = new Laptop();
        System.out.println(gamingLaptop);
        gamingLaptop.activeGamingMode();
        System.out.println("Gaming mode Actived");
        System.out.println("Frequncy set to: " + gamingLaptop.getfreq());
    }
}
