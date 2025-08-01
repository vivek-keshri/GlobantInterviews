package ProblemSolving;

import java.util.HashSet;
import java.util.Set;

//  Given the schedules (busy) of 2 employees in the following format, schedule a 2-hour meeting between the 2: [{start-time, end-time}, {start-time, end-time} …].
//        Throw an error if you cannot schedule the meeting on that particular day.
//        A: [[8,10][10,12][13,14][16,17]]   -->14,16
//        B: [[9,10][11,13][16,17]]


public class ScheduleMeeting {
    public static void main(String[] args) {
        int[][] employee1 = {{8,10},{10,12},{13,14},{16,17}};
        int[][] employee2 = {{9,10},{11,13},{16,17}};
        System.out.println(meetingTiming(employee1,employee2));
    }

    public static String meetingTiming(int[][] employee1,int[][] employee2){
        String message = "";
        Set<Integer> availableSlotsOfEmp1 = new HashSet<>();
        Set<Integer> availableSlotsOfEmp2 = new HashSet<>();

        int end = employee1[0][1];
        for(int[] entry:employee1){
            if(entry[0]-end >= 2){
                for(int k=0;k<entry[0]-end;k++){
                    availableSlotsOfEmp1.add(end+k);
                }
            }
            end = entry[1];
        }
        System.out.println(availableSlotsOfEmp1);

        end = employee2[0][1];
        for(int[] entry:employee2){
            if(entry[0]-end >= 2){
                for(int k=0;k<entry[0]-end;k++){
                    availableSlotsOfEmp2.add(end+k);
                }
            }
            end = entry[1];
        }
        System.out.println(availableSlotsOfEmp2);

        if(availableSlotsOfEmp1.size()<2 || availableSlotsOfEmp2.size()<2){
            message = "Meeting cant be scheduled";
        }

        else{
            availableSlotsOfEmp1.retainAll(availableSlotsOfEmp2);
            if(availableSlotsOfEmp1.size()>=2){
                message =  "meeting can be scheduled for hours " + availableSlotsOfEmp1;
            }
        }
    return message;
    }
}
