package string;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Most_Repeating_Character {
    public static void main(String[] args) {
        test("GeeksforGeeksofGeeksToGeeksByGgggggggggggggg");

    }

    private static void test(String str) {
        Map<Character,Integer> reference_map = new HashMap<>();
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(reference_map.containsKey(chars[i])) {
                Integer integer = reference_map.get(chars[i]);
                int temp = integer.intValue();
                temp++;
                reference_map.put(chars[i], temp);
            }
            else{
                reference_map.put(chars[i],1);
            }
        }
        System.out.println(reference_map);
        System.out.println(Collections.max(reference_map.entrySet(),Comparator.comparingInt(Map.Entry::getValue)));

    }
}
