package varsions.java11;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamEnhancementsOptional {
    public static void main(String[] args) {
        List<Integer> list_of_integers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> empty_list_of_integers = List.of();
        //Optional<Integer> max = list_of_integers.stream().max(Comparator.naturalOrder());
        Optional<Integer> max = empty_list_of_integers.stream().max(Comparator.naturalOrder());
        max.ifPresentOrElse((value)
                        -> { System.out.println(
                        "Value is present, its: "
                                + value); },
                ()
                        -> { System.out.println(
                        "Value is empty"); });
    }
}
