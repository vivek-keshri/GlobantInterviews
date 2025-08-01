package com.globant.interview;

class Parent8 {
    static void work() {
        System.out.println("Parent Working Style");
    }
}

class Child8 extends Parent {
    /*void static void work() {
        System.out.println("Child Working Style");
    }*/

    static void work1() {
        System.out.println("Child Working Style");
    }
}

public class OOPSConceptsProblem8 {
    public static void main(String[] args) {
        Parent8 p = new Parent8();
        Child8 c = new Child8();
        Parent pc = new Child8();
        p.work();
        c.work();
        pc.work();
    }
}
