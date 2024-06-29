package dataStructure.stack;

import java.util.Stack;

public class NextGreaterElementGivenArray {

    public static void main(String[] args){

        int[] nums = new int[]{7,2,1,3,25,1,0};
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);

        for(int i=1; i< nums.length; i++){

            int element = stack.peek();
            while(!stack.isEmpty() && nums[i] > element) {
                stack.pop();
                System.out.println(element + " ---> "+nums[i]);
                if(!stack.isEmpty())
                    element = stack.peek();
            }
            stack.push(nums[i]);
        }

        for(int element : stack) {
            System.out.println(element + " ----> " + "-1");

        }
    }
}
