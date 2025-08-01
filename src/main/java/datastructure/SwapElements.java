package datastructure;

import java.util.LinkedList;
import java.util.List;

public class SwapElements {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(10);
        list.add(25);
        list.add(45);
        list.add(31);
        list.add(16);
        list.add(23);
        list.add(51);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("*** Swapped ***");
        System.out.println(swapElement(7, list));
    }

    public static List swapElement(int index, LinkedList list) {
        if(index > list.size()){
            throw new IndexOutOfBoundsException("index is out of range");
        }
        LinkedList tempList = new LinkedList(list);
        int indextoswap = index-1;
        int indexwithswap = list.size()-index;
        tempList.add(indextoswap,list.get(indexwithswap));
        tempList.remove(indextoswap+1);
        tempList.add(indexwithswap,list.get(indextoswap));
        tempList.remove(indexwithswap+1);
        return tempList;
    }

}
