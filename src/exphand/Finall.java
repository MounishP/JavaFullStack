package exphand;

public class Finall {
    public static void main(String[] args) {
        int x = 0;
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("Division by 0(AE) ");
        }
        catch (Exception e){
            System.out.println("Division by 0 ");
        }finally {
            System.out.println(" Thank you");
        }
    }
}
