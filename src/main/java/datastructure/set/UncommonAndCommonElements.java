package datastructure.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UncommonAndCommonElements {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2,4,6,8,10,11,13,15,17,19));
        findCommonAndUnCommonElements(set1,set2);
    }

    public static void findCommonAndUnCommonElements(Set set1, Set set2) {
        Set<Integer> commonElements = new HashSet<>();
        Set<Integer> unCommonElements = new HashSet<>();

        // Creating Common Set
        commonElements.addAll(set1);
        commonElements.retainAll(set2);

        // Creating Un-Common Set
        unCommonElements.addAll(set1);
        unCommonElements.addAll(set2);
        unCommonElements.removeAll(commonElements);

        set1.removeAll(commonElements);
        set2.removeAll(commonElements);

        System.out.println("All Matching Values Are : "+commonElements);
        System.out.println("All Unique Values Are : "+unCommonElements);
        System.out.println("set1"+set1);
        System.out.println("set2"+set2);
    }
}
