package sorting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSortByValue {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Green");
        map.put(2,"Yellow");
        map.put(3,"Black");
        map.put(4,"White");
        map.put(6,"Purple");
        map.put(5,"Orange");
        map.put(7,"Pink");
        map.put(8,"Blue");
        map.put(9,"Sky Blue");
        map.put(10,"Red");

        Map<Integer, String> integerStringMap = sortByColors(map);
        System.out.println(map);
        System.out.println(integerStringMap);
    }

    private static Map<Integer,String> sortByColors(Map<Integer,String> colorsWithValue) {
        Map<Integer, String> sortedMap =
                colorsWithValue.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        return sortedMap;
    }


}
