package dataStructure.stack;

import java.util.Stack;

/**
 * This class removes all the Adjacent duplicate characters from a String.
 */
public class RemoveAdjacentDuplicateFromString {
    public static void main(String[] args){
        String str = "abbazzxyaaby";
        Stack<Character> stack = new Stack<>();

        for(int i =0; i<str.length(); i++){
            if(stack.isEmpty() || stack.peek() != str.charAt(i))
                stack.push(str.charAt(i));
            else if (stack.peek() == str.charAt(i))
                stack.pop();
        }

        var sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());

        System.out.println(sb.reverse());
    }
}
