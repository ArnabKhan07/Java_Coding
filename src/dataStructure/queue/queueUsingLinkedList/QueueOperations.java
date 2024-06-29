package dataStructure.queue.queueUsingLinkedList;

public class QueueOperations {

    public QNode front;
    public QNode rear;

    /**
     * Constructor to make Front and Rear Node null.
     */

    public QueueOperations(){
        this.front = null;
        this.rear = null;
    }

    /**
     * This method is used to add any value to Queue.
     * @param data is the value to add.
     */
    public void enQueue(int data){

        // Create Temp Node with the Data.
        QNode temp = new QNode(data);

        // If the last pointer is null, Set Rear and Front as Null.
        if(this.rear == null){
            this.rear = this.front = temp;
            return;
        }

        // Set the Temp Node to the next of Rear.
        this.rear.next = temp;

        // Shift the Rear to the Next.
        this.rear = this.rear.next;
    }

    /**
     * This Method removes the first value from the Queue.
     */
    public void deQueue(){

        // If the Queue is empty, do nothing.
        if(this.front == null){
            return;
        }

        // Change the front to next of Front;
        this.front = this.front.next;

        // If the Front becomes null, make the Rear to Null.
        if(this.front == null)
            this.rear = null;
    }

    /**
     * This Method is used to print the elements of the Queue.
     */
    public void display(){

        // If the Queue is empty, do nothing.
        if(this.front == null)
            return;

        QNode current = this.front;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
