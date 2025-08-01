package datastructure.linklist;

/*
* Write a code to revere link list.
* Ex:- input List : [1,2,3,4,5]
* Ex:- output List: [5,4,3,2,1]
* Ex:- input List : [1]
* Ex:- output List: [1]
* Ex:- input List : null
* Ex:- output List: exception with Input is null
* Ex:- input List : [1,2,2,4,5]
* Ex:- output List: [5,4,2,2,1]
* Ex:- input List : [1,1,1,1,1]
* Ex:- output List: [1,1,1,1,1]
* */

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ReverseElements {

    public static void main(String[] args) {
        List<Integer> input1 = List.of(1,2,3,4,5,6);
        //List<Integer> input2 = List.of(null);
        //List<Integer> input3 = List.of(1);
        //List<Integer> input4 = List.of(1,1,1,1,1);
        System.out.println(reverse(input1));
        //System.out.println(reverse(input2));
        //System.out.println(reverse(input3));
        //System.out.println(reverse(input4));
    }

    public static List<Integer> reverse(List<Integer> inputList){
        List<Integer> outputList = new LinkedList<>();
        if(Objects.isNull(inputList)){
            return null;
        }
        else if(inputList.size() == 1){
            return inputList;
        }
        else{
            for(int i=inputList.size()/2,end=inputList.size()-1;i>=0;i--,end--){
                if(outputList.size()<inputList.size()){
                    outputList.add(inputList.get(end));
                    end--;
                    if(end>=0) {
                        outputList.add(inputList.get(end));
                    }
                }
            }
        }
        return outputList;
    }
}
