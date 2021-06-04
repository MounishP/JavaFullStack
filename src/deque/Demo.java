package deque;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Demo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedBlockingDeque<>();
        deque.add(4);
        deque.add(5);
        deque.add(2);
        deque.add(7);
        deque.add(2);
        deque.add(7);

        for (Integer ele:deque){
            System.out.println(ele);
        }
        System.out.println("===============================================");

        deque.addFirst(12);
        deque.addLast(100);

        for (Integer ele:deque){
            System.out.println(ele);
        }
    }
}
