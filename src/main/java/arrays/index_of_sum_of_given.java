package arrays;

import java.util.List;

public class index_of_sum_of_given {
    public static void main(String[] args) {
        test(List.of(1, 2, 3, 4, 5, 6, 7, 8, 10),9);

    }

    private static void test(List<Integer> input, int given) {
        boolean found = false;
        for(int i = 0;i<input.size()/2;i++){
            if(input.contains(given-input.get(i))) {
                found = true;
                System.out.println("Found First value as Value "+input.get(i)+" at Index "+i);
                System.out.println("Found Second value as Value "+(given-input.get(i))+" at Index "+input.indexOf(given-input.get(i)));
            }
        }
        if(!found){
            System.out.println("No Unique Pair Found");
        }
    }
}
