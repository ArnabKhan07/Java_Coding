package dataStructure.stack;

import java.util.Stack;

/**
 * Contains all the Stack Operations.
 * Stack follows LIFO, Last In, First Out.
 */
public class StackOperations {

    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();

        // Push an element to the Stack.
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // Print the head element of the stack, without removing it.
        System.out.println(stack.peek());

        // Print the Size of the Stack.
        System.out.println(stack.size());

        // Check if the Stack is empty.
        while(!stack.empty())
            // Print the head element of the Stack.
            System.out.println(stack.pop());
    }
}