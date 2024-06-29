package dataStructure.stack;

import java.util.Stack;

public class RemoveStars {
    public static void main(String[] args){
        System.out.println("The String after removing stars is: "+removeStars("leet**code**"));
    }

    private static String removeStars(String str){
        Stack<Character> chars = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            if(!chars.isEmpty() && str.charAt(i) == '*') {
                var element = chars.peek();
                if(element != '*')
                    chars.pop();
                else
                    chars.push(str.charAt(i));
            }
            else
                chars.push(str.charAt(i));
        }
        var sb = new StringBuilder();
        while(!chars.isEmpty())
            sb.append(chars.pop());
        return sb.reverse().toString();
    }
}
