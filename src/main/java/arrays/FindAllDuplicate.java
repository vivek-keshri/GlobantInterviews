package arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int[] arrayWithDuplicate = {1,2,3,4,1,2,5,6,1,2,7,8,9,10,4,6,8};
        //List listWithDuplicates = List.of(1,2,3,4,1,2,5,6,1,2,7,8,9,10,4,6,8);
        Set tempSet = new HashSet();
        Set set = new HashSet();
        for (int i:arrayWithDuplicate) {
            if(tempSet.contains(i)){
                set.add(i);
            }
            else{
                tempSet.add(i);
            }
        }
        System.out.println(set);
    }

}
