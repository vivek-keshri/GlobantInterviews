package basic;

import java.util.Scanner;

public class Febonacci {

    public static void main(String[] args) {
        System.out.println("Kindly provide number of elements in Series");
        Scanner sc = new Scanner(System.in);
        int number_of_element = sc.nextInt();
        int first = 1;
        int second = 1;
        System.out.print(first);
        System.out.print(" ");
        System.out.print(second);
        System.out.print(" ");
        for(int i=2;i<number_of_element;i++){
            System.out.print(first+second);
            System.out.print(" ");
            second = first+second;
            first = second-first;
        }
    }
}
