package dataStructure.stack;

import java.util.Stack;

/**
 * This method removes the adjacent characters, if the characters are same but different is case.
 */
public class MakeTheStringGreat {

    public static void main(String[] args){
        System.out.println(makeGood("leEeetcode"));
    }

    public static String makeGood(String str){

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){

            if(stack.isEmpty()) {
                stack.push(str.charAt(i));
                continue;
            }

            Character lastChar = stack.peek();
            if((!stack.isEmpty()) && (lastChar - 32 == str.charAt(i) || lastChar + 32 == str.charAt(i))){
                stack.pop();
                continue;
            }

            stack.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());

        return sb.reverse().toString();
    }
}
