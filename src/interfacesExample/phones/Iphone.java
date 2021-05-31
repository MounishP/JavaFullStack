package interfacesExample.phones;

import interfacesExample.phone.Phone;

public class Iphone implements Phone {

    @Override
    public void processor() {
        System.out.println("A11");
    }

    @Override
    public void display() {
        System.out.println("6.4");
    }

    @Override
    public void battery() {
        System.out.println("li-po");

    }
}
