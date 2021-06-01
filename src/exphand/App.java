package exphand;

public class App {
    public static void main(String[] args) {
        case1(10,0);
        case2(10,0);
    }

    public static void case1(int x, int y){
        if(y!=0) {
            System.out.println(x / y);
        }else{
            System.out.println("y should not be 0");
        }
    }

    public static void case2(int x, int y){
        try {
            System.out.println(x / y);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Division by 0 is not possible");
        }
    }
}
