package dataStructure.stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args){

        String str = "[]{}()";
        Stack<Character> parenthesis = new Stack<>();
        var isValid = Boolean.TRUE;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == '(')
                parenthesis.push(')');
            else if (str.charAt(i) == '{')
                parenthesis.push('}');
            else if (str.charAt(i) == '[')
                parenthesis.push(']');
            else if (parenthesis.isEmpty() || parenthesis.pop()!= str.charAt(i)) {
                isValid = Boolean.FALSE;
                break;
            } else if(!parenthesis.isEmpty())
                parenthesis.pop();
        }
        if(!parenthesis.isEmpty())
            isValid = Boolean.FALSE;
        System.out.println(isValid);
    }
}
