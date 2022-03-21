package basic;

import java.util.Scanner;

public class CheckIfPrime {
    public static void main(String[] args) {
        System.out.println("Kindly provide number to be checked");
        int element_to_check = new Scanner(System.in).nextInt();
        boolean flag = false;
        int half = element_to_check/2;

        if(element_to_check==0 || element_to_check==1){
            System.out.println(element_to_check+" is not a Prime Number");
        }
        for(int i=2;i<half;i++){
            if(element_to_check/i == 0){
                System.out.println(element_to_check+" is not a Prime Number");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(element_to_check+" is a Prime Number");
        }
    }
}
