package multithread;

class A extends Thread{
    private int n;

    public A(int n) {
        this.n = n;
    }

    public void run(){
        counter();
    }


    public void counter() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " --> " + n);
        }
        System.out.println("Process completed");
    }
}

public class App {
    public static void main(String[] args) {
        A a = new A(1);
        A a1 = new A(2);
        long start = System.currentTimeMillis();
        a.start();
        System.out.println("-------------------------------");
        a1.start();
        long end = System.currentTimeMillis();
        System.out.println("Time taken: "+ (end - start));
    }
}
