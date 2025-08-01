package datastructure;

import java.util.*;

public class MaxDistanceBetween2Words {
    public static void main(String[] args) {
        System.out.println(distanceBetween2Words("the brown fox jumps over the fence jumps brown fox","brown","jumps"));
        System.out.println(distanceBetween2Words("the brown fox jumps over the fence jumps brown fox","the","fox"));
    }

    private static int distanceBetween2Words(String sentence,
                                             String first,
                                             String second){
        int length = -1;
        Map<String, List<Integer>> map_to_refer = new HashMap<>();
        if(sentence.contains(first) && sentence.contains(second)){
            String[] str = sentence.split(" ");
            int counter = 0;
            for(String s:str){
                List l = new ArrayList();
                if(map_to_refer.containsKey(s)){
                    l = map_to_refer.get(s);
                    l.add(counter);
                    map_to_refer.put(s,l);
                }
                else{
                    l.add(counter);
                    map_to_refer.put(s,l);
                }
                counter++;
            }
        }

        List<Integer> secondIntegers = map_to_refer.get(second);
        List<Integer> firstIntegers = map_to_refer.get(first);
        System.out.println("map_to_refer"+map_to_refer);
        //length = findSmallestDifference(firstIntegers,secondIntegers);
        length = findLargestDifference(firstIntegers,secondIntegers);
        return length;
    }

    static int findSmallestDifference(List<Integer> first, List<Integer> second)
    {
        // Sort both arrays
        // using sort function
        Collections.sort(first);
        Collections.sort(second);

        int a = 0, b = 0;

        // Initialize result as max value
        int result = Integer.MAX_VALUE;

        // Scan Both Arrays upto
        // sizeof of the Arrays
        while (a < first.size() && b < second.size())
        {
            if (Math.abs(first.get(a) - second.get(b)) < result)
                result = Math.abs(first.get(a) - second.get(b));

            // Move Smaller Value
            if (first.get(a) < second.get(b))
                a++;

            else
                b++;
        }

        // return final sma result
        return result-1;
    }

    static int findLargestDifference(List<Integer> first, List<Integer> second)
    {
        // Sort both arrays
        // using sort function
        Collections.sort(first);
        Collections.sort(second);

        int a = 0, b = 0;

        // Initialize result as max value
        int result = 0;

        // Scan Both Arrays upto
        // sizeof of the Arrays
        while (a < first.size() && b < second.size())
        {
            if (Math.abs(first.get(a) - second.get(b)) > result)
                result = Math.abs(first.get(a) - second.get(b));

            // Move Smaller Value
            if (first.get(a) < second.get(b))
                a++;

            else
                b++;
        }

        // return final sma result
        return result-1;
    }
}


