package dataStructure.stack;

import java.util.Stack;

/**
 * This Method compare two Strings removing backspace defined as '#'
 */
public class BackSpaceStringCompare {
    public static void main(String[] args) {
        System.out.println(checkEquality("ab#c", "ad#c"));
    }

    public static Boolean checkEquality(String str1, String str2) {

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(Character ch : str1.toCharArray()){
            if(!stack1.isEmpty() && ch == '#')
                stack1.pop();
            else if(ch != '#')
                stack1.push(ch);
        }

        for(Character ch : str2.toCharArray()){
            if(!stack2.isEmpty() && ch == '#')
                stack2.pop();
            else if(ch != '#')
                stack2.push(ch);
        }

        if(stack1.size()!=stack2.size())
            return false;
        while(!stack1.isEmpty()){
            if(stack1.pop()!=stack2.pop())
                return false;
        }
        return true;
    }
}
