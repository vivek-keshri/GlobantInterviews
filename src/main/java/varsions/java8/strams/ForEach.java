package varsions.java8.strams;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> list_of_integers = List.of(1,2,3,4,5,6,7,8,9,10);
        printListElements(list_of_integers);
        printListElementsUsingStreams(list_of_integers);
        printListElementsUsingStreamsAndMethodReference(list_of_integers);
    }

    private static void printListElements(List<Integer> elements) {
        for (Integer element : elements) {
            System.out.print(element+" ");
        }
    }

    private static void printListElementsUsingStreams(List<Integer> elements) {
        elements.stream().forEach(element -> System.out.print(element +" "));
    }

    private static void printListElementsUsingStreamsAndMethodReference(List<Integer> elements) {
        elements.stream().forEach(System.out::print);
    }
}
