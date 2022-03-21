package com.globant.interview;

class Animal{}

class Monkey extends Animal{
}

public class OverloadCase4 {
    public void m1(Animal a){
        System.out.println("Animal Version");
    }
    public void m1(Monkey m){
        System.out.println("Monkey Version");
    }
    public static void main(String[] args) {
        OverloadCase4 overloadCase4 = new OverloadCase4();
        Animal a = new Animal();
        Monkey m = new Monkey();
        Animal am = new Monkey();
        overloadCase4.m1(a);
        overloadCase4.m1(m);
        overloadCase4.m1(am);
    }
}
