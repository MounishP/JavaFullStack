package multithread;

public class Demo {

    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0;i<10000;i++){
                    Demo.counter++;
                }
                System.out.println("Thread 1 completed");
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0;i<10000;i++){
                    Demo.counter++;
                }
                System.out.println("Thread 2 completed");
            }
        });

        thread.start();
        thread1.start();
        Thread.sleep(30000);
        System.out.println(counter);
    }
}
