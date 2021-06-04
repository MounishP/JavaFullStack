package queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(5);

        try {
            queue.remove();
        } catch (NoSuchElementException e) {
            System.out.println("Queue is Empty");
        }

        try {
            queue.add(4);
            queue.add(5);
            queue.add(2);
            queue.add(7);
            queue.add(2);
            queue.add(7);
        } catch (IllegalStateException e) {
            System.out.println("Queue is Full");
        }

        for (Integer ele:queue){
            System.out.println(ele);
        }
        System.out.println("-----------------");
        queue.remove();
        for (Integer ele:queue){
            System.out.println(ele);
        }
    }
}
