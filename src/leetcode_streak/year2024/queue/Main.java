package leetcode_streak.year2024.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        // Queue = FIFO data structure. First-In First-Out

        // A collection designed for holding elements prior to processing Linear data structure

        // add = enqueue, offer()
        // remove = dequeue, poll()

        Queue<String> queue = new LinkedList<>();

        System.out.println(queue.isEmpty());

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.size());
        System.out.println(queue.contains("Chad"));

        System.out.println(queue.peek());
        queue.poll(); // deque

        // Where are queues useful ?

        // 1. Keyboard Buffer (Letters should appear on the screen in the order they are pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search
    }
}
