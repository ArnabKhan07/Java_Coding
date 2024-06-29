package dataStructure.queue.queueLibrary;

import java.util.LinkedList;
import java.util.Queue;

// Queue Follows FIFO principle.
public class QueueImplementation {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue Operation. Add method throws an Exception, if the element cannot be added.
        queue.add(1);
        queue.add(2);

        // Enqueue Operation. Offer method returns False, if the element cannot be added.
        queue.offer(3);

        // Displaying the Queue.
        System.out.println(queue);

        // View Front element of the Queue.
        System.out.println(queue.element()); // Throws exception if Queue is empty.
        System.out.println(queue.peek()); // Returns null if the Queue is empty.

        // Dequeue Operation. Remove method throws an Exception, if the queue is empty.
        queue.remove();

        // Dequeue Operation. poll method returns null, if the queue is empty.
        queue.poll();

        // Displaying the Queue.
        System.out.println(queue);
    }
}
