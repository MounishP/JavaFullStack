package listinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Li {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();   //more operations
        names.add("mounish");
        names.add("nitin");
        names.add("poojitha");
        names.add("hemalatha");
        new Li().getAllNames(names);

        List<String> demo = new ArrayList<>();      //less operations and more searching
        demo.add("mounish");
        demo.add("nitin");
        demo.add("poojitha");
        demo.add("hemalatha");
        new Li().getAllNames(demo);
    }

    void getAllNames(List<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("--------------------------------------------");
    }
}
