package collections.boxing;

import java.util.ArrayList;
class intWrapper{
    public int value;

    public intWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
public class Hello {
    public static void main(String[] args) {
        /*ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);                                                      //Autoboxing
        System.out.println(nums.get(0));*/

        ArrayList<intWrapper> nums = new ArrayList<>();
        nums.add(new intWrapper(4));                                   //boxing
        System.out.println(nums.get(0).getValue());                          //unboxing

        ArrayList<Double> elements = new ArrayList<>();
        elements.add(3.4);


    }
}
