package encapsulaion.main;

import encapsulaion.Person;

public class Encapsulation {
    public static void main(String[] args){
//        Person person = new Person();
//        System.out.println(person);

        Person poojitha = new Person();
        poojitha.setName("Poojitha");
        poojitha.setAge(-22);
        poojitha.setGender("female");
        System.out.println(poojitha);
    }
}
