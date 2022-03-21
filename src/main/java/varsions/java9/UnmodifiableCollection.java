package varsions.java9;

import java.util.Map;

public class UnmodifiableCollection {


    public static void main(String[] args) {
        Map m = Map.of("vivek",0,null,1);
        m.put("aman",2);
        System.out.println(m);
    }
}
