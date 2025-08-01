package arrays;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class InsertElementInSortedArray {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.addAll(List.of(12, 16, 20, 40, 50, 70));
        System.out.println("Before insertion ::" + set);
        set.add(58);
        System.out.println("After insertion ::" + set);

    }
}
