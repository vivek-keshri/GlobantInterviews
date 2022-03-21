package varsions.java10;

/**
 * Since java 10 we can define variables with var
 * type will be detected automatically based on value.
 * but its only limited to method level and with initialization.
 */
public class varDemo {

    // Not Allowed at class Level
    // var strVar = "Vivek from var";

    public static void main(String[] args) {

        int i = 10;
        String str = "Vivek";
        var strVar = "Vivek from var";
        //strVar = new Integer(1);

        System.out.println(i);
        System.out.println(str);
        System.out.println(strVar);

    }
}
