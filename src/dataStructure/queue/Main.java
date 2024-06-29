package dataStructure.queue;

import dataStructure.queue.queueUsingLinkedList.QueueOperations;

public class Main {
    public static void main(String[] args){

        QueueOperations queue = new QueueOperations();

        System.out.println("Adding elements in the Queue.");
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        System.out.println("Displaying Data of the Queue.");
        queue.display();

        System.out.println("Removing element from the Queue.");
        queue.deQueue();

        System.out.println("Displaying Data of the Queue.");
        queue.display();
    }
}
