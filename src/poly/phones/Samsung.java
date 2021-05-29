package poly.phones;

import poly.Phone.Phone;

public class Samsung extends Phone {

    public Samsung(String model) {
        super(model);
    }

    public void features(){
        System.out.println("Smart flagship");
    }

}
