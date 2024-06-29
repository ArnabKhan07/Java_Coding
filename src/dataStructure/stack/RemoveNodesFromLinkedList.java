package dataStructure.stack;

import java.util.Stack;

public class RemoveNodesFromLinkedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(5);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(13);
        ListNode forthNode = new ListNode(3);
        ListNode fifthNode = new ListNode(8);

        node.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = fifthNode;
        ListNode result = removeNodes(node);

        while(result!= null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    private static ListNode removeNodes(ListNode head) {

        ListNode current = head;
        Stack<Integer> stack = new Stack<>();
        while(current != null){
            while(!stack.isEmpty() && stack.peek()<current.val)
                stack.pop();
            stack.push(current.val);
            current = current.next;
        }

        ListNode temp = new ListNode();
        temp.next = null;
        while(!stack.isEmpty()){
            temp.val = stack.pop();
            var prev = new ListNode();
            prev.next = temp;
            temp = prev;
        }
        return temp.next;
    }
}
