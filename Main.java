public class Main {
    public static void main(String[] args) {

        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertAtFront(20);
        linkedList.insertAtFront(30);
        linkedList.insertAtFront(40);

        System.out.println("After adding from front:");
        linkedList.printLinkedList();

        linkedList.insertAtEnd(50);
        linkedList.insertAtEnd(60);
        linkedList.insertAtEnd(70);

        System.out.println("After adding at end:");
        linkedList.printLinkedList();

        System.out.println("Searching in the list:");
        System.out.println(linkedList.searchElement(linkedList.head, 10));
        System.out.println(linkedList.searchElement(linkedList.head, 30));

        Node firstNode = new Node(100);
        Node secondNode = new Node(200);
        Node thirdNode = new Node(300);

        linkedList = new SinglyLinkedList();
        linkedList.head = firstNode;
        linkedList.head.next = secondNode;
        secondNode.next = thirdNode;

        System.out.println("After adding after a node:");
        linkedList.insertAfter(secondNode, 500);
        linkedList.printLinkedList();

        System.out.println("The length of the LinkedList is:");
        System.out.println(linkedList.getLength(linkedList.head, 0));

        linkedList.deleteElement(linkedList.head, 300);
        System.out.println("After Deleting Element:");
        linkedList.printLinkedList();

        System.out.println("Deleting from a Given Position:");
        linkedList.deleteElementByPosition(2);
        linkedList.printLinkedList();

        System.out.println("Reversing the LinkedList using Iterative Method");
        SinglyLinkedList reversedList = new SinglyLinkedList();
        reversedList.head = linkedList.reverseLinkedList();
        reversedList.printLinkedList();

        System.out.println("--------------------------------------------------------");
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtFront(10);
        doublyLinkedList.insertAtFront(20);
        doublyLinkedList.insertAtFront(30);

        System.out.println("After adding from front:");
        doublyLinkedList.printLinkedList();

        System.out.println("After adding from end:");
        doublyLinkedList.insertAtEnd(40);
        doublyLinkedList.insertAtEnd(50);
        doublyLinkedList.printLinkedList();

        System.out.println("After adding an element before a Node:");
        doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.head = new DoublyNode(100);
        DoublyNode secondDoublyNode = new DoublyNode(200);
        DoublyNode thirdDoublyNode = new DoublyNode(300);

        doublyLinkedList.head.next = secondDoublyNode;
        secondDoublyNode.prev = doublyLinkedList.head;
        secondDoublyNode.next = thirdDoublyNode;
        thirdDoublyNode.prev = secondDoublyNode;


        doublyLinkedList.insertBefore(secondDoublyNode, 150);
        doublyLinkedList.printLinkedList();

        System.out.println("After adding an element after a Node:");
        doublyLinkedList.insertAfter(secondDoublyNode, 250);
        doublyLinkedList.printLinkedList();
    }
}