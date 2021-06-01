package exphand;

public class Multicatch {
    public static void main(String[] args) {
        int x = 0, y = 0;
        try{
            System.out.println("this will be printed");
            x = ( y = 10*10)/0;
            System.out.println("this will not print");
        }catch (ArithmeticException e){
            System.out.println("It is an arithematic exception");
        }catch (Exception e){
            System.out.println("Division not possible");
        }
        System.out.println(y);
    }
}
