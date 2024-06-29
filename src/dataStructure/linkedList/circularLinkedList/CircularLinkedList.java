package dataStructure.linkedList.circularLinkedList;

public class CircularLinkedList {

    public CircularNode head;

    public CircularLinkedList(){
        this.head = null;
    }

    // Display the Elements of the List.
    public void printElements() {
        CircularNode currentNode = head;
        if(currentNode != null) {
            do {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            } while(currentNode!= head);
        }
    }

    // Add Element at the Front of the List.
    public void addElementAtFront(int data) {
        CircularNode newNode = new CircularNode(data);
        if(head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            CircularNode prev = head;
            if(prev.next != head) {
                prev = prev.next;
            }
            prev.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    //Add Element at the of the List.
    public void addElementAtEnd(int data) {
        CircularNode newNode = new CircularNode(data);
        if(head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        CircularNode lastNode = head;
        while(lastNode.next != head) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
        newNode.next = head;
    }

    //Add Element after a given node.
    public void addElementAfterNode(CircularNode node, int data) {
        CircularNode newNode = new CircularNode(data);
        CircularNode currentNode = head;
        while(currentNode != node){
            currentNode = currentNode.next;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public void deleteFromList(int data) {

        CircularNode currentNode = head;

        while(currentNode.data!= data && currentNode.next!= head) {
            currentNode = currentNode.next;
        }

        if(currentNode.data == data) {

            // For only one element
            if(currentNode == head && currentNode.next == head) {
                head = null;
                return;
            }
            // for last element
            if(currentNode.next == head) {
                currentNode.data = currentNode.next.data;
                currentNode.next = currentNode.next.next;
                head = currentNode;
                return;
            }
            currentNode.data = currentNode.next.data;
            currentNode.next = currentNode.next.next;
        }
    }
}
