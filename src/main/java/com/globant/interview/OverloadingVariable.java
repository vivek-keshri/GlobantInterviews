package com.globant.interview;

class Parent3{
    int x = 100;
}

class Child3 extends Parent3{
    int x = 200;
}

public class OverloadingVariable {
    public static void main(String[] args) {
        Parent3 p = new Parent3();
        Child3 c = new Child3();
        Parent3 p3 = new Child3();

        System.out.println(p.x);
        System.out.println(c.x);
        System.out.println(p3.x);

    }

}
