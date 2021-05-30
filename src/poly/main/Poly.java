package poly.main;

import poly.Phone.Phone;
import poly.phones.Nokia;
import poly.phones.Samsung;

public class Poly {
    public static void main(String[] args){
        Phone phone = new Poly().phone(1);
        System.out.println(phone.getModel());
        phone.features();

        Phone phone1 = new Poly().phone(2);
        System.out.println(phone1.getModel());
        phone1.features();


    }

    public Phone phone(int dialyDriver){
        switch (dialyDriver){
            case 1: return new Samsung("note 8");
            case 2: return new Nokia("1100");
        }
        return null;
    }
}
