package basic;

public class TokenQuiz {
    public static void main(String[] args) {
        String text = "a,b,c,,";
        String[] tokens = text.split(",");
        System.out.println(tokens.length);
    }
}
