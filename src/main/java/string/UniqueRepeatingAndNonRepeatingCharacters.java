package string;

/*
*  File contains text “aaaaaaiiiiiiijjjjjjjwwwwwwaaaaaiiiiiiii” ,
*  write a program to print output “aijwai”
* (output string should contain characters in same order which is
* mentioned in file with less time complexity)
* write a program to print output “aijw”
* (maintain order of characters with less time complexity)
*
* */

import java.util.HashSet;
import java.util.Set;

public class UniqueRepeatingAndNonRepeatingCharacters {
    public static void main(String[] args) {
        String str = "aaaaaaiiiiiiijjjjjjjwwwwwwaaaaaiiiiiiii";
        UniqueRepeatingAndNonRepeatingCharacters.PrintUniqueCharactersWithOrderedRepetition(str);
        System.out.println();
        UniqueRepeatingAndNonRepeatingCharacters.PrintUniqueCharactersWithOrderWithoutRepetition(str);
    }

    private static void PrintUniqueCharactersWithOrderedRepetition(String str) {
        char ref = str.toCharArray()[0];
        System.out.print(ref);
        for(char c:str.toCharArray()){
            if(c!=ref){
                System.out.print(c);
            }
            ref=c;
        }
    }

    private static void PrintUniqueCharactersWithOrderWithoutRepetition(String str) {
        Set refSet = new HashSet();
        char ref = str.toCharArray()[0];
        System.out.print(ref);
        for(char c:str.toCharArray()){
            if(c!=ref && !refSet.contains(c)){
                System.out.print(c);
            }
            refSet.add(c);
            ref=c;
        }
    }
}
