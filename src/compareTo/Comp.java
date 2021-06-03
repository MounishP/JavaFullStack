package compareTo;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Names implements Comparable<Names>{
    private String name;

    public Names(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name= " + name;
    }

    @Override
    public int compareTo(Names o) {
        if (name.length() == o.name.length()){
            return 0;
        }else if (name.length() > o.name.length()){
            return -1;
        }else
            return 1;
    }
}


public class Comp {
    public static void main(String[] args) {
        Comp comp = new Comp();
        List<Names> names = new LinkedList<>();
        names.add(new Names("mounish"));
        names.add(new Names("hema"));
        names.add(new Names("poojitha"));
        names.add(new Names("latha"));
        comp.getAllNames(names);
        Collections.sort(names);
        comp.getAllNames(names);
    }
    void getAllNames(List<Names> list){
        Iterator<Names> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------------------");
    }
}
