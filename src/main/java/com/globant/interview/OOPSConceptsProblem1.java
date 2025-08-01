package com.globant.interview;

class PolymorphismProblem1 {

    void m1(int i){
        System.out.println("welcome from int M1 Method");
    }
    void m1(float i){
        System.out.println("welcome from float M1 Method");
    }
}

public class OOPSConceptsProblem1 {
    public static void main(String[] args) {
        PolymorphismProblem1 polymorphism = new PolymorphismProblem1();
        polymorphism.m1(10);
        polymorphism.m1(10f);
        polymorphism.m1('a');
    }
}
