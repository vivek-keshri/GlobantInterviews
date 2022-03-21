package basic;

import java.util.HashSet;
import java.util.Set;

public class First_non_repeating {
    public static void main(String[] args) {
        test("GeeksGeeks");

    }

    private static void test(String str) {
        Set<Character> compared = new HashSet<>();
        char[] chars = str.toCharArray();
        boolean found = false;
        for(int i=0;i<chars.length;i++){
            if(!compared.contains(chars[i])) {
                compared.add(chars[i]);
                if (!str.substring(i + 1).contains(String.valueOf(chars[i]))) {
                    found = true;
                    System.out.println(chars[i]);
                    break;
                }
            }
            else{
                continue;
            }
        }
        if(!found){
            System.out.println("No Repeating Character Found");
        }
    }
}
