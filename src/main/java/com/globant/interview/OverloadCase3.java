package com.globant.interview;

class Overload3 {

    void m1(String str){
        System.out.println("welcome from String M1 Method");
    }
    void m1(StringBuffer obj){
        System.out.println("welcome from StringBuffer M1 Method");
    }
}

public class OverloadCase3 {
    public static void main(String[] args) {
        Overload3 overload3 = new Overload3();
        /*overload3.m1(null);*/
    }
}
