package dataStructure.stack;

import java.util.Stack;

public class BaseBallGame {
    public static void main(String[] args){

        var operations = new String[] {"5","2","C","D","+"};
        Stack<Integer> scores = new Stack<>();

        for (String operation : operations) {

            if (!scores.isEmpty() && operation.equals("C"))
                scores.pop();

            else if (!scores.isEmpty() && operation.equals("D")) {
                var element = scores.peek();
                scores.push(element * 2);
            } else if (scores.size() > 1 && operation.equals("+")) {
                var element1 = scores.pop();
                var element2 = scores.pop();
                scores.push(element2);
                scores.push(element1);
                scores.push(element1 + element2);
            } else
                scores.push(Integer.valueOf(operation));
        }

        int sum = 0;
        while(!scores.isEmpty())
            sum += scores.pop();

        System.out.println("Total score is :"+sum);
    }
}
