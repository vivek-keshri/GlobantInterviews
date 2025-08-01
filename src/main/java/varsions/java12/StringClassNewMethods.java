package varsions.java12;

public class StringClassNewMethods {
    public static void main(String[] args) {
        String text_indent = "Hello Globant!\nThis is Java 12 Demo.";
        String text_transform = "Globant";
        System.out.println("-----------------indent-----------------");

        text_indent = text_indent.indent(4);
        System.out.println(text_indent);

        text_indent = text_indent.indent(-10);
        System.out.println(text_indent);

        String transform = text_transform.transform(value ->
                new StringBuilder(value).reverse().toString()
        );
        System.out.println("-----------------transform-----------------");
        System.out.println(transform);
    }

}
