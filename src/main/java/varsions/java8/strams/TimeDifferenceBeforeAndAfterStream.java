package varsions.java8.strams;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class TimeDifferenceBeforeAndAfterStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> even_list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        long startTimeInMillis = Calendar.getInstance().getTimeInMillis();
        for(int i=0;i<10;i++){
            if(i%2==0){
                even_list.add(i);
            }
        }
        long endTimeInMillis = Calendar.getInstance().getTimeInMillis();
        List<Integer> even_list_stream = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        List<Integer> double_list_stream = list.stream().map(i->i*2).collect(Collectors.toList());
        long endTimeInMillisWithStream = Calendar.getInstance().getTimeInMillis();
        System.out.println("difference_without_stream ::"+(endTimeInMillis-startTimeInMillis));
        System.out.println("difference_with_stream ::"+(endTimeInMillisWithStream-endTimeInMillis));
        System.out.println("double_list_stream ::"+double_list_stream);
    }
}
