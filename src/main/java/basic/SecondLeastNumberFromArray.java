package basic;

public class SecondLeastNumberFromArray {
    public static void main(String[] args) {
        int[] list_of_values = {-5,-6,-7,-8,-3,-16,-1,-2};
        int min = second_minimum(list_of_values);
        System.out.println(min);
    }

    private static int second_minimum(int[] list_of_values) {
        int smallest,second_smallest;
        if(list_of_values.length < 2){
            return 0;
        }
        if(list_of_values[0] > list_of_values[1]){
            smallest = list_of_values[1];
            second_smallest = list_of_values[0];
        }
        else{
            smallest = list_of_values[0];
            second_smallest = list_of_values[1];
        }

        for(int i=2;i<=list_of_values.length-1;i++){
            if(list_of_values[i] < smallest){
                second_smallest = smallest;
                smallest = list_of_values[i];
            }
            else if(list_of_values[i] > smallest && list_of_values[i] < second_smallest){
                second_smallest = list_of_values[i];
            }
            else{
                continue;
            }
        }

        return second_smallest;
    }



}
