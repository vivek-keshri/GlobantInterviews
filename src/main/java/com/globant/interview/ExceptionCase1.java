package com.globant.interview;

public class ExceptionCase1 {
    public static void main(String[] args){

        try{
            int i = 0;
            int j = 10;
            int k = j/i;
        }
        catch(Exception e){
            System.out.println("from catch of Exception");
        }
        /*catch(ArithmeticException e){
            System.out.println("from catch of ArithmeticException");
        }*/
        finally {
            System.out.println("from finally");
        }
    }
}
