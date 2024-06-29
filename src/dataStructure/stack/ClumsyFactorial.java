package dataStructure.stack;

import java.util.Stack;

public class ClumsyFactorial {
    public static void main(String[] args){
        int number = 4;
        Stack<String> factorial = new Stack<>();
        factorial.push(String.valueOf(number--));
        int operation = 0;

        while(number > 0){
            if(operation % 4 == 0){
                var element = Integer.parseInt(factorial.pop());
                factorial.push(String.valueOf(element*number));
            } else if (operation % 4 == 1) {
                var element = Integer.parseInt(factorial.pop());
                factorial.push(String.valueOf(element/number));
            } else if (operation % 4 == 2) {
                factorial.push("+");
                factorial.push(String.valueOf(number));
            } else if (operation % 4 == 3) {
                factorial.push("-");
                factorial.push(String.valueOf(number));
            }
            number--;
            operation++;
        }

        int sumCounterPart = 0;
        int minusCounterPart = 0;

        while(factorial.size()>1){
            var element = Integer.parseInt(factorial.pop());
            if(factorial.pop().equals("+"))
                sumCounterPart+= element;
            else
                minusCounterPart+= element;
        }

        sumCounterPart+= Integer.parseInt(factorial.pop());
        System.out.println("Clumsy Factorial is: "+(sumCounterPart-minusCounterPart));
    }
}
