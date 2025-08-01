package fit;

/*
*       Input:   str = "a,b$c"
*       Output:  str = "c,b$a"
*
*/


import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        String str = "a,b$c";
        Stack<Character> normalChar = new Stack<>();
        List<Character> specialChar = new LinkedList<>();
        for(Character c:str.toCharArray()){
            if(Character.isAlphabetic(c)){
                normalChar.add(c);
            }
            else{
               specialChar.add(c);
            }
        }

        System.out.print(normalChar.pop());
        for(int i=0;i<specialChar.size();i++){
            System.out.print(specialChar.get(i));
            if(!normalChar.empty()){
                System.out.print(normalChar.pop());
            }
        }
    }

}
