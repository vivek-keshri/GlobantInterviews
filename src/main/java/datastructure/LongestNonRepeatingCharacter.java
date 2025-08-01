package datastructure;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(longestNonRepeating("abcabcbb"));
        System.out.println(longestNonRepeating("pwwkew"));
        System.out.println(longestNonRepeating("geeksforgeeks"));

    }

    private static String longestNonRepeating(String str){
        String test="";
        //Set<Character> substring = new HashSet<>();
        String max = "";
        for(char c:str.toCharArray()){
            if(test.contains(String.valueOf(c))){
                if(max.length() <= test.length()){
                    max = test;
                }
                test = "";
                continue;
            }
            else{
                test = test.concat(String.valueOf(c));

            }
        }
        if(test.length()>max.length()){
            max = test;
        }
        return max;

    }
}
