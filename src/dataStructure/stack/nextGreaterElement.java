package dataStructure.stack;

import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args){
        var greaterElementArray = fetchGreaterElement(new int[]{2,1,4,1,2});
        for(int num : greaterElementArray)
            System.out.println(num);
    }

    private static int[] fetchGreaterElement(int[] arr){
        Stack<Integer> stack = new Stack<>();
        var res = new int[arr.length];
        for(int i = arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<= arr[i])
                stack.pop();

            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return res;
    }
}
