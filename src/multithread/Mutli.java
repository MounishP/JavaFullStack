package multithread;

class Bracket{
    synchronized public static void generate(){
            for (int i = 0;i<10;i++){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i<5){
                    System.out.print("[");
                }else{
                    System.out.print("]");
                }
            }
            System.out.println();

        for (int i = 0;i<5;i++){
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Mutli {
    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        new Thread(new Runnable() {
            @Override
            public void run() {
                long start = System.currentTimeMillis();
                for (int i = 0; i<5;i++){
                    Bracket.generate();
                }
                long end = System.currentTimeMillis();
                System.out.println(end-start);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                long start = System.currentTimeMillis();
                for (int i = 0; i<5;i++){
                    Bracket.generate();
                }
                long end = System.currentTimeMillis();
                System.out.println(end-start);
            }
        }).start();
    }
}


/*
sync method --> 4167
sync block --> 2537
 */