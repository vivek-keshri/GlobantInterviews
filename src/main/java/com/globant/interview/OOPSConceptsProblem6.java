package com.globant.interview;

class Parent{
    void work(){
        System.out.println("Parent Working Style");
    }
}

class Child extends Parent{
    void work(){
        System.out.println("Child Working Style");
    }
    void work1(){
        System.out.println("Child Working Style");
    }
}

public class OOPSConceptsProblem6 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();
        p.work();
        c.work();
        pc.work();
    }
}
