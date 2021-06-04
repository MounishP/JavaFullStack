package generics;

import finalEx.B;
import linkedlist.Link;
import listinterface.Li;

import java.util.LinkedList;
import java.util.List;

class Bata{
    public <E> void printList(List<E> list){
        for (E element:list){
            System.out.println(element);
        }
    }

    public <E> void printArray(E[] array){
        for (E element:array){
            System.out.println(element);
        }
    }
}
public class M {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(3);

        List<String> list_name = new LinkedList<>();
        list_name.add("mounish");
        list_name.add("poojitha");
        list_name.add("nitin");
        list_name.add("hemalatha");
        Bata bata = new Bata();
        bata.printList(list);
        bata.printList(list_name);

        String[] names = {"mounish","nitin","pooji","hema"};
        Integer[] nums = {1,2,3,4,5,6};
        bata.printArray(names);
        bata.printArray(nums);
    }
}
