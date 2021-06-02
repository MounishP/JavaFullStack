package collections.stack;
//CRUD
import java.util.Stack;

public class Hi {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("mounish");
        names.push("nitin");
        names.push("poojitha");
        names.push("hemalatha");

//        System.out.println(names);
//        for(String name:names){
//            System.out.println(name);
//        }

        names.pop();
        System.out.println(names);
        System.out.println(names.peek());

    }
}
