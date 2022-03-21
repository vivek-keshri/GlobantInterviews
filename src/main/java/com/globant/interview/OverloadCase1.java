package com.globant.interview;

class Overload1 {

    void m1(int i){
        System.out.println("welcome from int M1 Method");
    }
    void m1(float i){
        System.out.println("welcome from float M1 Method");
    }
}

public class OverloadCase1 {
    public static void main(String[] args) {
        Overload1 overload1 = new Overload1();
        overload1.m1(10);
        overload1.m1(10f);
        overload1.m1('a');
    }
}
