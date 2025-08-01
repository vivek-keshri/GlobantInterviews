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

public class OOPSConceptsProblem7 {
    public static void main(String[] args) {
        Parent2 p = new Parent2();
        Child2 c = new Child2();
        //Parent pc = new Child2();

        try {
            p.m1();
            c.m1();
            //pc.m1();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
