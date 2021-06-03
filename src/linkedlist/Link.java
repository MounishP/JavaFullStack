package linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Link {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("mounish");
        names.add("nitin");
        names.add("poojitha");
        names.add("hemalatha");
        Link link = new Link();
        link.getAllNames(names);
        names.add(1,"Ary");
        link.getAllNames(names);
        names.remove(2);
        link.getAllNames(names);
        names.set(2,"java");
        link.getAllNames(names);
        Collections.sort(names);
        link.getAllNames(names);
        Collections.reverse(names);
        link.getAllNames(names);
        names.sort(null);
        link.getAllNames(names);
    }

    void getAllNames(LinkedList<String> list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------------------------");
    }
}
