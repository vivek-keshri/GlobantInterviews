    package com.globant.interview;

    class PolymorphismProblem2 {

        void m1(String str){
            System.out.println("welcome from String M1 Method");
        }
        void m1(Object obj){
            System.out.println("welcome from Object M1 Method");
        }
    }

    public class OOPSConceptsProblem2 {
        public static void main(String[] args) {
            PolymorphismProblem2 polymorphismProblem2 = new PolymorphismProblem2();
            polymorphismProblem2.m1(null);
        }
    }

