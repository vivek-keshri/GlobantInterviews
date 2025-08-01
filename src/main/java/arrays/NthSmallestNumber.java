package arrays;

/*
 * Find Nth Smallest Number from Int Array
 * let Array = [0,1,6,4,8,9,12,5,4] and N = 4
 * Output should be 4 as 0,1,4,4 so 4th Smallest number will be 4
 * */

import java.util.Map;
import java.util.TreeMap;

public class NthSmallestNumber {
    public static void main(String[] args) {
        int[] list = {0, 1, 6, 4, 8, 9, 12, 5, 4};
        int n = 4;
        NthSmallestNumber.findNthSmallest(list, n);

    }

    private static void findNthSmallest(int[] list, int n) {

        if (n > list.length) {
            System.out.println("Asked Position is not available in List, Hence Nth Element is not possible");
            return;
        }

        Map<Integer, Integer> referenceMap = new TreeMap<>();
        for (int i : list) {
            if (referenceMap.containsKey(i)) {
                Integer counter = referenceMap.get(i);
                referenceMap.put(i, ++counter);
            } else {
                referenceMap.put(i, 1);
            }
        }
        System.out.println(referenceMap);

        int KthHighest = 0;
        for (Map.Entry<Integer, Integer> entry : referenceMap.entrySet()) {
            Integer value = entry.getValue();
            Integer key = entry.getKey();
            KthHighest += value;
            if (KthHighest >= n) {
                System.out.println("Kth Smallest Element of List is " + key);
                break;
            }
        }
    }

}
