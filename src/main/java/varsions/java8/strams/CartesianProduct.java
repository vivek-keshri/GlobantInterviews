package varsions.java8.strams;

import java.util.List;

public class CartesianProduct {

    public static void main(String[] args) {
        List listOfIntegers = List.of("1","2","3");
        List listOfChar = List.of("A","B");
        printCartesianProduct(listOfIntegers,listOfChar);
    }

    private static void printCartesianProduct(List<String> list1, List<String> list2) {
        list1.stream()
                .flatMap(e1 -> list2.stream().map(e2 -> new String[]{e1, e2}))
                .forEach(arr -> System.out.println(arr[0] + "-" + arr[1]));
    }
}
