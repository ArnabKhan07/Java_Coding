package dataStructure.linkedList.doublyLinkedList;

public class DoublyLinkedList {

    public DoublyNode head;

    public DoublyLinkedList() {
        this.head = null;
    }

    //Print Elements of the List.
    public void printLinkedList() {
        DoublyNode currentNode = head;
        while(currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    //Adding elements at the Front.
    public void insertAtFront(int data) {
        DoublyNode newNode = new DoublyNode(data);

        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //Adding element at the End.
    public void insertAtEnd(int data) {
        DoublyNode newNode = new DoublyNode(data);
        DoublyNode currentNode = head;

        if(currentNode == null) {
            head = newNode;
            return;
        }

        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        newNode.prev = currentNode;
        currentNode.next = newNode;
    }

    //Adding element before a given Node.
    public void insertBefore(DoublyNode currentNode, int data) {
        DoublyNode newNode = new DoublyNode(data);

        newNode.prev = currentNode.prev;
        currentNode.prev = newNode;
        newNode.next = currentNode;

        if (newNode.prev != null)
            newNode.prev.next = newNode;
        else
            head = newNode;
    }

    //Adding element after a given Node.
    public void insertAfter(DoublyNode currentNode, int data) {
        DoublyNode newNode = new DoublyNode(data);

        newNode.next = currentNode.next;
        currentNode.next = newNode;
        newNode.prev = currentNode;

        if(newNode.next != null)
            newNode.next.prev = newNode;
    }

    //Search position of an Element in a LinkedList.
    public int searchPosition(int data) {
        DoublyNode currentNode = head;
        int pos = 0;
        while(currentNode!= null) {
            if(currentNode.data == data)
                return pos;
            pos++;
            currentNode = currentNode.next;
        }
        return -1;
    }

    //Delete an Element from a DoublyLinkedList.
    public int deleteElement(DoublyNode currentNode, int data) {

        if(currentNode == null)
            return -1;

        if(currentNode.data == data) {
            if(currentNode.next != null) {
                currentNode.data = currentNode.next.data;
                currentNode.next = currentNode.next.next;
                currentNode.next.next.prev = currentNode;
                return 1;
            } else {
                return 0;
            }
        }

        if(this.deleteElement(currentNode.next, data) == 0) {
            currentNode.next = null;
            return 1;
        }
        return -1;
    }

    //Delete an Element on a Position of a DoublyLinkedList.
    public void deleteAtPosition(int pos) {

        DoublyNode currentNode = head;
        if(currentNode == null) {
            System.out.println("The List is empty");
            return;
        }

        for(int i =0; i<pos-1 && currentNode!= null; i++) {
            currentNode = currentNode.next;
        }

        if(currentNode == null) {
            System.out.println("The Item is not found");
            return;
        }

        // For the last position.
        if(currentNode.next == null) {
            DoublyNode prevNode = currentNode.prev;
            prevNode.next = null;
            return;
        }

        currentNode.data = currentNode.next.data;
        currentNode.next = currentNode.next.next;
        currentNode.next.next.prev = currentNode;
    }
}
