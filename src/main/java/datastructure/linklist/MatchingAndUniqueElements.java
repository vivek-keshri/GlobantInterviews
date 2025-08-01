package datastructure.linklist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
* Find All Matching And Unique Elements
* from two List with and without Lambda Expression.
*
* {1,2,3,4,5,6,7,8,9,10};
* {6,7,8,9,10,11,12,13,14,15};
*
* output :-
* [6, 7, 8, 9, 10]
* [1, 2, 3, 4, 5, 11, 12, 13, 14, 15]
*
* */

public class MatchingAndUniqueElements {
    public static void main(String[] args) {
        List oneToTen = List.of(1,2,3,4,5,6,7,8,9,10);
        List sixToFifteen = List.of(6,7,8,9,10,11,12,13,14,15);

        List union = new ArrayList();
        List distinct = new ArrayList();
        List distinctStream = new ArrayList();
        
        // Matching in Both Without Stream
        union.addAll(oneToTen);
        union.retainAll(sixToFifteen);
        System.out.println(union);

        // Unique in Both Without Stream
        distinct.addAll(oneToTen);
        distinct.removeAll(sixToFifteen);
        
        List tempList = new ArrayList();
        tempList.addAll(sixToFifteen);
        tempList.removeAll(oneToTen);
        distinct.addAll(tempList);

        System.out.println(distinct);
        
        // Matching in Both With Stream
        List unionStream = (List) oneToTen.stream().filter(x -> sixToFifteen.contains(x)).collect(Collectors.toList());
        System.out.println(unionStream);

        // Unique in Both With Stream
        List collectFirst = (List) oneToTen.stream().filter(x -> !sixToFifteen.contains(x)).collect(Collectors.toList());
        List collectNext = (List) sixToFifteen.stream().filter(x -> !oneToTen.contains((x))).collect(Collectors.toList());
        distinctStream.addAll(collectFirst);
        distinctStream.addAll(collectNext);
        System.out.println(distinctStream);
    }
}
