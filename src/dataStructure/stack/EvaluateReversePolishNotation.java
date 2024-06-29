package dataStructure.stack;

import java.util.Stack;

/**
 * This Method Calculate the Equation based on Polish Notation.
 */
public class EvaluateReversePolishNotation {
    public static void main(String[] args){
        System.out.println("The calculated value is: "+calculateEquation(new String[]{"2","1","+","3","*"}));
    }
    private static int calculateEquation(String[] tokens){
        Stack<String> stack = new Stack<>();
        for(String str : tokens){
            switch (str) {
                case "+" -> {
                    var element1 = Integer.parseInt(stack.pop());
                    var element2 = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(element1 + element2));
                }
                case "-" -> {
                    var element1 = Integer.parseInt(stack.pop());
                    var element2 = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(element2 - element1));
                }
                case "*" -> {
                    var element1 = Integer.parseInt(stack.pop());
                    var element2 = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(element1 * element2));
                }
                case "/" -> {
                    var element1 = Integer.parseInt(stack.pop());
                    var element2 = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(element2 / element1));
                }
                default -> stack.push(str);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
