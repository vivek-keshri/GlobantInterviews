package string;

/*
 *       WAP to reverse string considering only alphabets should be reversed
 *       Input:   str = "a,b$c"
 *       Output:  str = "c,b$a"
 *
 *       Input:   str = "a,b$c^D"
 *       Output:  str = "D,b$c^a"
 *
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ReverseStringIgnoringSpecialCharacters {
    public static void main(String[] args) {
        //ReverseStringIgnoringSpecialCharacters.reverse("a,b$c");
        ReverseStringIgnoringSpecialCharacters.reverse("a,b$c^D");


    }

    private static void reverse(String s) {
        Stack<Character> normalChar = new Stack<>();
        List<Character> specialChar = new LinkedList<>();
        for(char c:s.toCharArray()){
            if(Character.isAlphabetic(c)){
                normalChar.push(c);
            }
            else{
                specialChar.add(c);
            }
        }

        // normal a,b,c
        // special , $
        System.out.print(normalChar.pop());
        for(int i=0;i<specialChar.size();i++){
            System.out.print(specialChar.get(i));
            if(!normalChar.isEmpty()) {
                System.out.print(normalChar.pop());
            }
        }
        System.out.println();
    }

}

