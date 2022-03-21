package varsions.java9;

import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
         String str  = "                  Hello Motto - Welcome from Globant\n" +
                 "hello\n" +
                 "from" +
                 "motto             ";
        System.out.println(str.isBlank());
        System.out.println("===================================================");
        List<String> collect = str.lines().collect(Collectors.toList());
        System.out.println(collect.toString());
        System.out.println("===================================================");
        System.out.println(str.strip());
        System.out.println("===================================================");
        System.out.println(str.stripLeading());
        System.out.println("===================================================");
        System.out.println(str.stripTrailing());
        System.out.println("===================================================");
        System.out.println(str.repeat(2));
        System.out.println("===================================================");
    }
}
