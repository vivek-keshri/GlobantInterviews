package arrays;

/*
* Find Nth Highest Number from Int Array
* let Array = [0,1,6,4,8,9,12,5,4] and N = 4
* Output should be 6 as 12,9,8,6 so 4th highest number will be 6.
* */


import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class NthHighestNumber {
    public static void main(String[] args) {
        int[] list = {0,1,6,4,8,9,12,5,4};
        int n = 2;
        //NthHighestNumber.findNthHighest(list,n);
        System.out.println((Arrays.stream(list).sorted().skip(list.length-n).findFirst()));
    }

    private static void findNthHighest(int[] list, int n) {

        if(n > list.length){
            System.out.println("Asked Position is not available in List, Hence Nth Element is not possible");
            return;
        }

        TreeMap<Integer,Integer> referenceMap = new TreeMap<>();
        for(int i:list){
            if(referenceMap.containsKey(i)) {
                Integer counter = referenceMap.get(i);
                referenceMap.put(i, ++counter);
            }
            else{
                referenceMap.put(i,1);
            }
        }
        System.out.println(referenceMap);

        int KthHighest = 0;
        for (Map.Entry<Integer,Integer> entry : referenceMap.descendingMap().entrySet()) {
            Integer value = entry.getValue();
            Integer key = entry.getKey();
            KthHighest+=value;
            if(KthHighest>=n){
                System.out.println("Kth Highest Element of List is "+key);
                break;
            }
        }
    }
}
