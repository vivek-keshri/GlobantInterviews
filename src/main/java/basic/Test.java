package basic;

import java.io.BufferedWriter;
import java.util.Arrays;

class A {
    static int add(int i,int j) {
         return i+j;
     }
}
public class Test extends A{

    /**
     * @param args
     */
    public static void main(String[] args) {
        short s = 9;
        System.out.println(add(s,6));
        String hello = "Hello";
        System.out.println("Test.main");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("hello = " + hello);
        if (hello == null) {

        }



        

    }
}
