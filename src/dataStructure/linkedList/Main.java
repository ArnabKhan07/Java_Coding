package dataStructure.linkedList;

import dataStructure.linkedList.circularLinkedList.CircularLinkedList;
import dataStructure.linkedList.circularLinkedList.CircularNode;
import dataStructure.linkedList.doublyLinkedList.DoublyLinkedList;
import dataStructure.linkedList.doublyLinkedList.DoublyNode;
import dataStructure.linkedList.singlyLinkedList.Node;
import dataStructure.linkedList.singlyLinkedList.SinglyLinkedList;

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
        linkedList.insertAfter(secondNode, 1000);
        linkedList.printLinkedList();

        System.out.println("The length of the LinkedList is:");
        System.out.println(linkedList.getLength(linkedList.head, 0));

        System.out.println("The Middle of the LinkedList:");
        System.out.println(linkedList.middleValue(linkedList.head));

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

        System.out.println("Search an Element in a DoublyLinkedList:");
        System.out.println(doublyLinkedList.searchPosition(200));

        System.out.println("After Deleting an Element in DoublyLinkedList:");
        doublyLinkedList.deleteElement(doublyLinkedList.head, 100);
        doublyLinkedList.printLinkedList();

        System.out.println("After Deleting an Element by Position:");
        doublyLinkedList.deleteAtPosition(1);
        doublyLinkedList.printLinkedList();

        System.out.println("--------------------------------------------------------");
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.addElementAtFront(10);
        circularLinkedList.addElementAtFront(20);
        circularLinkedList.addElementAtFront(30);
        System.out.println("After adding from front:");
        circularLinkedList.printElements();

        circularLinkedList.addElementAtEnd(100);
        circularLinkedList.addElementAtEnd(200);
        circularLinkedList.addElementAtEnd(300);
        System.out.println("After adding from end:");
        circularLinkedList.printElements();

        circularLinkedList = new CircularLinkedList();
        CircularNode first = new CircularNode(25);
        CircularNode second = new CircularNode(35);
        CircularNode third = new CircularNode(45);
        CircularNode forth = new CircularNode(55);
        circularLinkedList.head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = circularLinkedList.head;

        System.out.println("After adding after a given Node:");
        circularLinkedList.addElementAfterNode(first, 40);
        circularLinkedList.printElements();

        System.out.println("After Deleting an Element in CircularLinkedList:");
        circularLinkedList.deleteFromList(25);
        circularLinkedList.printElements();
    }
}