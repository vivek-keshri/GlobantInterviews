package string;

/**
 * WAP to reverse the words in a given string.
 * The words in the string are separated by spaces.
 * The program should maintain the order of characters within each word
 * but reverse the order of the words in the string.
 * If the input string is empty, print "String is Empty".
 * If the string contains only one word,
 * print the word as it is.
 *
 * EX:
 *      Input: "Rome was not Built in a day"
 *      Output: "day a in Built not was Rome"
 *
 *      Input: "SingleWord"
 *      Output: "SingleWord"
 *
 *      Input: ""
 *      Output: "String is Empty"
 *
 */
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
