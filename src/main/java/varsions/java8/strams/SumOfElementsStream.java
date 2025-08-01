package varsions.java8.strams;

import java.util.List;

public class SumOfElementsStream {
    public static void main(String[] args) {
        List<Integer> list_of_integers = List.of(1,2,3,4,5,6,7,8,9,10);
        int sum = list_of_integers.stream().mapToInt(x -> x.intValue()).sum();
        System.out.println(sum);
        int sum_of_odd = list_of_integers.stream().filter(x->x%2==1).mapToInt(x -> x.intValue()).sum();
        System.out.println(sum_of_odd);
    }
}
