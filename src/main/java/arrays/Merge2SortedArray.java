package arrays;

import java.util.List;
import java.util.Set;

import java.util.TreeSet;

public class Merge2SortedArray {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.addAll(List.of(1,2,3,4,8,9,10));
        set.addAll(List.of(5,6,7,11,12,13));
        System.out.println(set);
    }
}
