package varsions.java11;

import java.util.List;
import java.util.stream.Collectors;

public class StreamEnhancementsWhile {
    public static void main(String[] args) {
        List<Integer> list_of_integers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> take_while_values_less_then_5 = list_of_integers.stream().takeWhile(entry -> entry < 5)
                .collect(Collectors.toList());
        List<Integer> take_while_values_greater_then_5 = list_of_integers.stream().takeWhile(entry -> entry > 5)
                .collect(Collectors.toList());
        List<Integer> drop_while_values_less_then_5 = list_of_integers.stream().dropWhile(entry -> entry < 5)
                .collect(Collectors.toList());
        List<Integer> drop_while_values_greater_then_5 = list_of_integers.stream().dropWhile(entry -> entry > 5)
                .collect(Collectors.toList());
        System.out.println(take_while_values_less_then_5);
        System.out.println(take_while_values_greater_then_5);
        System.out.println(drop_while_values_less_then_5);
        System.out.println(drop_while_values_greater_then_5);
    }
}
