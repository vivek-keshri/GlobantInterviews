package string;

public class ReverseStringByWords {

    public static void main(String[] args) {
        test("Rome was not Built in a day");

    }

    private static void test(String str) {
        if(str.length() == 0){
            System.out.println("String is Empty");
        }
        else if(str.length() == 1){
            System.out.println(str);
        }

        String[] words = str.split(" ");
        for(int i= words.length-1;i>=0;i--){
            if(i==0){
                System.out.print(words[i]);
            }
            else{
                System.out.print(words[i]+" ");
            }
        }

    }
}
