package dataStructure.stack;

import java.util.Stack;

/**
 * The Method return the length of the String after removing Sub-String base on
 * If we get 'AB' or 'CD', then remove both.
 */
public class MinimumLengthAfterRemovingSubString {
    public static void main(String[] args){
        System.out.println("The Minimum Length of the String after removing subString is: "+checkLength("ABCDACB"));
    }

    private static int checkLength(String str){
        Stack<Character> stack = new Stack<>();
        for(Character ch : str.toCharArray()){
            if(!stack.isEmpty() && ch == 'B' && stack.peek() == 'A')
                stack.pop();
            else if(!stack.isEmpty() && ch == 'D' && stack.peek() == 'C')
                stack.pop();
            else
                stack.push(ch);
        }
        return stack.size();
    }
}
