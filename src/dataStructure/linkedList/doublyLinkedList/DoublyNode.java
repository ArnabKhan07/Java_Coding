package dataStructure.linkedList.doublyLinkedList;

public class DoublyNode {

    public Integer data;
    public DoublyNode prev;
    public DoublyNode next;

    public DoublyNode(Integer data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
