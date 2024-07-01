package dataStructure.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BuildTheArrayWithStackOperations {

    public static void main(String[] args){
        buildArray(new int[]{1,3}, 3).forEach(System.out::println);
    }

    public static List<String> buildArray(int[] target, int n) {

        Stack<String> operations = new Stack<>();
        int initial = 1;
        int index = 0;

        while(index < target.length && initial <= n) {

            operations.push("push");

            if(initial == target[index])
                index++;
            else
                operations.push("pop");

            initial++;
        }

        return new ArrayList<>(operations);
    }
}
