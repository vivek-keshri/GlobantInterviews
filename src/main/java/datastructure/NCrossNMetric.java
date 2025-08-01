package datastructure;

import java.util.Scanner;

public class NCrossNMetric {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly Enter number");
        int n = sc.nextInt();

        int value = 'A';
        int current = value;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(current>=value+n){
                    current = value;
                }
                System.out.print((char)(current));
                current++;
            }
            current=value+i;
            System.out.println();
        }


    }





}
