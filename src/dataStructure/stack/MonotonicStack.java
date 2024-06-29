package dataStructure.stack;

import java.util.Stack;

/**
 * Monotonic Stack means, It will be either always Increasing or Decreasing Stack.
 */
public class MonotonicStack {

    public static void main(String[] args){

        int[] nums = new int[]{3,1,2,5,6};
        //Monotonic Increasing Stack.
        Stack<Integer> increasingStack = new Stack<>();
        for(int num : nums){
            while(!increasingStack.isEmpty() && increasingStack.peek()>num){
                increasingStack.pop();
            }
            increasingStack.push(num);
        }

        System.out.println("Monotonic Increasing Stack is: ");
        while(!increasingStack.isEmpty())
            System.out.println(increasingStack.pop());

        //Monotonic Decreasing Stack.
        Stack<Integer> decreasingStack = new Stack<>();
        for(int num : nums){
            while(!decreasingStack.isEmpty() && decreasingStack.peek()<num)
                decreasingStack.pop();
            decreasingStack.push(num);
        }

        System.out.println("Monotonic Decreasing Stack is: ");
        while(!decreasingStack.isEmpty())
            System.out.println(decreasingStack.pop());
    }
}
