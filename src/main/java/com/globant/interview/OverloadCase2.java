    package com.globant.interview;

    class Overload2 {

        void m1(String str){
            System.out.println("welcome from String M1 Method");
        }
        void m1(Object obj){
            System.out.println("welcome from Object M1 Method");
        }
    }

    public class OverloadCase2 {
        public static void main(String[] args) {
            Overload2 overload2 = new Overload2();
            overload2.m1(null);
        }
    }

