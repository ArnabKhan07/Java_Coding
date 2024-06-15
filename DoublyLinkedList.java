public class DoublyLinkedList {

    DoublyNode head;

    DoublyLinkedList() {
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
}
