package collections;
//CRUD ---> CREATE, RETRIVE,UPDATE,DELETE
import java.util.ArrayList;

public class App {
    static ArrayList<String> names = new ArrayList<>();
    public static void main(String[] args) {
        names.add("mounish");
        names.add("nitin");
        names.add("poojitha");
        names.add("hemalatha");
        App app = new App();
        app.getAllNames(names);
        System.out.println("-------------------------------------------------");
        app.removeByPosition(0);
        System.out.println(names.get(0));
        app.getAllNames(names);
        System.out.println("------------------------------------------------");
        app.removeByName("nitin");
        app.getAllNames(names);
        System.out.println("-----------------------------------------------");
        app.modifyName(0,"Pooji");
        app.getAllNames(names);
        System.out.println("------------------------------------------------");
        int value = app.search("hemalatha");
        if(value != -1){
            System.out.println("Record Found");
        }else{
            System.out.println("Record not Found");
        }
    }

    void getAllNames(ArrayList<String> names){
        for (String name:names) {
            System.out.println(name);
        }
    }

    void removeByPosition(int position){
        names.remove(position);
    }

    void removeByName(String name){
        names.remove(name);
    }

    void modifyName(int position,String name){
        names.set(position,name);
    }

    int search(String name){
        return names.indexOf(name);
    }
}
