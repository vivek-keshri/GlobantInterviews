package varsions.java8;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        String[] s = {"vivek","Abhijeet","Anurag","Diptiranjan","jhankaar"};
        Predicate<String> p1 = s1 -> s1.length()>5;
        Predicate<String> p2 = s1 -> s1.length()<9;
        for(String str:s){
            if(p1.and(p2).test(str)){
                System.out.println(str);
            }
        }
    }
}
