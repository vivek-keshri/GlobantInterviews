package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

/*
        --------------------------------
        Anagram Grouping
        ---------------------------------

        Write a program to arrange values in array by its anagram grouping.
        if anagram matching value is not present, both items should be ignored

        ex:- {"pot", "ant", "sap", "nat", "pas", "top"}
        output :- [[pot, top], [sap, pas]]


 */


public class AnagramGrouping {
    public static void main(String[] args) {
        String[] arrayOfValues = {"pot", "ant", "sap", "nat", "pas", "top"};
        List<String> strings = new LinkedList<>(Arrays.asList(arrayOfValues));
        List<List<String>> result = new ArrayList<>();
        for (String s : strings) {
            if (strings.contains(reverse(s))) {
                List<String> pair = List.of(s, reverse(s));
                if (!result.contains(List.of(reverse(s), s))) {
                    result.add(pair);
                }
            }
        }

        System.out.println(result);
    }
}
