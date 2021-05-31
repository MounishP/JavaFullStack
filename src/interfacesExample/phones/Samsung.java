package interfacesExample.phones;

import interfacesExample.phone.Phone;

public class Samsung implements Phone {
    @Override
    public void processor() {
        System.out.println("S850");
    }

    @Override
    public void display() {
        System.out.println("6");
    }

    @Override
    public void battery() {
        System.out.println("liquid");
    }
}
