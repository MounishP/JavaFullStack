package arrays;

public class Methods {
    public static void main(String[] args) {
//        int x = 3;
//        Methods obj = new Methods();
//        obj.display(x);
//        System.out.println("in main: " + x);

        String[] names = {"Mounish", "Nitin", "Poojitha", "hemalatha", "ARY"};
        Methods methods = new Methods();
        methods.namesDisplay(names);
//        System.out.println(names);
        System.out.println(names[0]);
    }

    void display(int x) {
        System.out.println(x);
        x = 5;
        System.out.println("inside display: " + x);
    }

    void namesDisplay(String[] names){
        for(String name:names){
            System.out.println(name);
        }
        names[0] = "pvm";
    }
}
