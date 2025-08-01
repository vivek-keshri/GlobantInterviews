package com.globant.interview;

class PolymorphismProblem3 {

    void m1(String str){
        System.out.println("welcome from String M1 Method");
    }
    void m1(StringBuffer obj){
        System.out.println("welcome from StringBuffer M1 Method");
    }
}

public class OOPSConceptsProblem3 {
    public static void main(String[] args) {
        PolymorphismProblem3 PolymorphismProblem3 = new PolymorphismProblem3();
        /*PolymorphismProblem3.m1(null);*/
    }
}
