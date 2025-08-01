package datastructure.linklist;

import java.util.ArrayList;
import java.util.List;

public class MatchingFrom2BigArrayList {
    public static void main(String[] args) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for(int i=0;i<1000;i++){
            if(i%2==0){
                evenList.add(i);
                if(List.of(100,200,300,400,500,600,700,800,900,1000).contains(i)){
                    oddList.add(i);
                }
            }
            else{
                oddList.add(i);
            }
        }

        List<Integer> matching = new ArrayList<>();
        matching.addAll(evenList);
        matching.retainAll(oddList);
        System.out.println("All Common Values in 2 Lists are "+matching);

    }
}
