package collection;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeatingCharacterInString {
    public static void main(String[] args) {
        MaxRepeatingCharacterInString.findMostRepeating("aaabbccd");
    }

    private static void findMostRepeating(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                int integer = map.get(c);
                map.put(c, ++integer);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }

}
