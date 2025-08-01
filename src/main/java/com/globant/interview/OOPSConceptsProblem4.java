package com.globant.interview;

class Animal{}
class Monkey extends Animal{
}
public class OOPSConceptsProblem4 {
    public void m1(Animal a){
        System.out.println("Animal Version");
    }
    public void m1(Monkey m){
        System.out.println("Monkey Version");
    }
    public static void main(String[] args) {
        OOPSConceptsProblem4 oopsConceptsProblem4 = new OOPSConceptsProblem4();
        Animal a = new Animal();
        Monkey m = new Monkey();
        Animal am = new Monkey();
        /*Monkey ma = new Animal();*/
        oopsConceptsProblem4.m1(a);
        oopsConceptsProblem4.m1(m);
        oopsConceptsProblem4.m1(am);
        /*oopsConceptsProblem4.m1(ma);*/
    }
}
