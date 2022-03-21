package varsions.java9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfForCollection {
    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Vivek");
        listOfStrings.add("Viansh");

        Set<Integer> setOfIntegers = new HashSet<>();
        setOfIntegers.add(32);
        setOfIntegers.add(2);

        Map<String,Integer> mapOfPairs = new HashMap<>();
        mapOfPairs.put("Vivek",32);
        mapOfPairs.put("Viansh",2);

        System.out.println(listOfStrings);
        System.out.println(setOfIntegers);
        System.out.println(mapOfPairs);

        List<String> newListOfStrings = List.of("Vivek","Viansh");
        Set<Integer> newSetOfIntegers = Set.of(32,2);
        Map<String,Integer> newMapOfPairs = Map.of("Vivek",32,"Viansh",2);
        Map<String,Integer> newMapOfPairsEntries = Map.ofEntries(Map.entry("Vivek",32),Map.entry("Viansh",2));

        System.out.println(newListOfStrings);
        System.out.println(newSetOfIntegers);
        System.out.println(newMapOfPairs);
        System.out.println(newMapOfPairsEntries);

    }
}
