package arrays;

/*
* Write a program which takes 2 digits,
* X,Y as input and generates a 2-dimensional array.
* The element value in the i-th row and j-th column of the array should be i*j.
*
* Note: i=0,1.., X-1; j=0,1,Y-1.
* Example:
* Suppose the following inputs are given to the program:
* 3,5
* Then, the output of the program should be:
* [
*  [0, 0, 0, 0, 0],
*  [0, 1, 2, 3, 4],
*  [0, 2, 4, 6, 8]
* ]
*
* */

import java.util.Scanner;

public class Generate2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly Provide Number of Rows you want in Array");
        int rows = scanner.nextInt();
        System.out.println("Kindly Provide Number of columns you want in Array");
        int columns = scanner.nextInt();
        draw2DArray(rows,columns);
    }

    private static void draw2DArray(int rows, int columns) {
        int[][] twoD_arr = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                twoD_arr[i][j] = i*j;
                System.out.print(i*j+" ");
            }
            System.out.println();
        }

    }
}
