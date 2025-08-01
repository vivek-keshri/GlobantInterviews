package string;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString.reverseUsingStacks("Hello");
        System.out.println();
        ReverseString.reverseUsingLoop("Hello");
        System.out.println();
        ReverseString.reverseUsingSB("Hello Motto");
    }

    private static void reverseUsingSB(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }

    private static void reverseUsingStacks(String str) {
        Stack<Character> tempStack = new Stack<>();
        for (char c:
        str.toCharArray()) {
            tempStack.push(c);
        }
        while(!tempStack.isEmpty()){
            System.out.print(tempStack.pop());
        }
    }

    private static void reverseUsingLoop(String str) {
        char[] chars = str.toCharArray();
        for (int k = chars.length-1;k>=0;k--) {
            System.out.print(chars[k]);
            }
        }
}



