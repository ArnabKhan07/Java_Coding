package dataStructure.stack;

import java.util.Stack;

/**
 * This Class fetches Maximum Depth Parenthesis.
 */
public class MaximumDepthOfParenthesis {

    public static void main(String[] args) {
        var expression = "((8*2)+9+((2+7)-4))";
        Stack<Integer> stack= new Stack<>();
        int depth = 0;

        for(int i =0; i<expression.length(); i++){
            if(expression.charAt(i) == '(')
                stack.push(-1);
            else if (expression.charAt(i) == ')') {
                depth = Math.max(stack.size(), depth);
                stack.pop();
            }
        }

        System.out.println("Maximum depth is: "+depth);
    }
}
