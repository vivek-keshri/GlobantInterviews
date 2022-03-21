package com.globant.interview;
import java.io.IOException;

class Parent2{
    void m1() throws IOException{
        System.out.println("Welcome from Parent M1");
    }
}

class Child2 extends Parent2{
    /*void m1() throws Exception{
        System.out.println("Welcome from Child M1");
    }*/
}

public class OverrideCase2 {
    public static void main(String[] args) {

    }
}
