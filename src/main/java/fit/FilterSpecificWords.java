package fit;

/*
*   List<String> mylist ={“I”,”Me”,”you”,”I”,”him”,”her”,”I”};
*    How do you get a list called resultList
*    that has only the values ”I” and “Me” from the mylist.
*    (with using java 8 and without using java 8)
*
* */

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterSpecificWords {
    public static void main(String[] args) {
        List<String> mylist = List.of("I", "Me", "you", "I", "him", "her", "I");
        List<String> resultlist = new LinkedList<>();

        // Without Java 8
        for (String entry : mylist) {
            if (entry.equalsIgnoreCase("I") || entry.equalsIgnoreCase("Me")) {
                resultlist.add(entry);
            }
        }
        System.out.println(resultlist);

        // Using Java 8
        List<String> collect = mylist.stream()
                .filter(x -> x.equalsIgnoreCase("I") || x.equalsIgnoreCase("Me"))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
