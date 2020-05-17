package PartialDone;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample__PD {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        queue.offer(21);
        queue.offer(10);
        queue.offer(81);
        queue.offer(9);
        queue.offer(100);
        queue.offer(1);

        //poll() method removes the head of the queue
        System.out.println(queue.poll()); // will remove the least element from the front, so here 1 is least it will be removed
        System.out.println(queue);

    }
}
