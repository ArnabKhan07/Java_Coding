public class SinglyLinkedList {

    Node head;
    SinglyLinkedList() {
        this.head = null;
    }

    //Print The SinglyLinkedList
    public void printLinkedList() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    //Insert At Front of the SinglyLinkedList
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //Insert At the End of the SinglyLinkedList
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if(head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    //Insert After a Given Node in the SinglyLinkedList
    public void insertAfter(Node prevNode, int data) {
        if(prevNode == null) {
            System.out.println("The Given Node Can't be Null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    //Search Element in a SinglyLinkedList
    public Boolean searchElement(Node currentNode, int data) {
        if(currentNode == null)
            return false;
        if(currentNode.data == data)
            return true;
        return this.searchElement(currentNode.next, data);
    }

    //Get the Length of the SinglyLinkedList
    public int getLength(Node currentNode, int count) {
        if(currentNode == null)
            return count;
        return this.getLength(currentNode.next, count+1);
    }

    //Delete from a SinglyLinkedList
    public int deleteElement(Node currentNode, int data) {
        if(currentNode == null) {
            System.out.println("The Element is not found");
            return -1;
        }

        // If the Data matches the Current Node's Data.
        if(currentNode.data == data) {

            // If not the last Node
            if(currentNode.next != null) {
                currentNode.data = currentNode.next.data;
                currentNode.next = currentNode.next.next;
                return 1;
            }
            return 0;
        }

        if(this.deleteElement(currentNode.next, data) == 0){
            currentNode.next = null;
            return 1;
        }
        return -1;
    }

    // Delete from a SinglyLinkedList from a given position
    public void deleteElementByPosition(int position) {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;

        for(int i=0; temp != null && i<position-1; i++)
            temp = temp.next;

        if(temp == null || temp.next == null)
            return;
        temp.next = temp.next.next;
    }

    //Reverse a SinglyLinkedList
    public Node reverseLinkedList() {

        Node prev = null;
        Node currenntNode = head;
        Node next;

        while(currenntNode != null) {

            next = currenntNode.next;
            currenntNode.next = prev;
            prev = currenntNode;
            currenntNode = next;
        }
        return prev;
    }
}
