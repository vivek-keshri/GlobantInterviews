package varsions.java8.strams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Filter {

    public static void main(String[] args) {
        List<Integer> list_of_integers = List.of(1,2,3,4,5,6,7,8,9,10);
        filterListElements(list_of_integers);
        filterListElementUsingStreams(list_of_integers);
        filterListElementUsingStreamsWithMultipleFilter(list_of_integers);

        List<Integer> range = IntStream.rangeClosed(-100, 100)
                .boxed().collect(Collectors.toList());
        
        printNumbersDivisibleBy7AndEitherLowerThanMinus50orGreaterThan50(range);

        printStringsThatGivenSetContainsAndStartsWithGivenPrefix(
                List.of("nullHello","motto","Hello","nullmotto"),
                Set.of("nullHello","nullmotto"),
                "null");
    }

    /**
     * Traditional Approach of Filtering Elements
     * @param elements
     */
    private static void filterListElements(List<Integer> elements) {
        for (Integer element : elements) {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }
    }

    /**
     * Stream Approach of Filtering Elements
     * @param elements
     */
    private static void filterListElementUsingStreams(List<Integer> elements) {
        elements.stream().filter(element -> element % 2 == 0).forEach(System.out::println);
    }

    /**
     * Stream Approach of Filtering Elements with multiple filters
     * @param elements
     */
    private static void filterListElementUsingStreamsWithMultipleFilter(List<Integer> elements) {
        elements.stream()
                .filter(element -> element % 2 == 0)
                .filter(element -> element > 5)
                .forEach(System.out::println);
    }

    /**
     * Print the numbers that are divisible by 7 and either lower than -50 or greater than 50.
     * @param numbers
     */
    private static void printNumbersDivisibleBy7AndEitherLowerThanMinus50orGreaterThan50(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 7 == 0)
                .filter(number -> number > 50 || number < -50)
                .forEach(System.out::println);
    }

    /**
     * Print the strings that given set contains and starts with given letter
     * @param string
     * @param set
     * @param prefix
     */
    private static void printStringsThatGivenSetContainsAndStartsWithGivenPrefix(List<String> string, Set<String> set, String prefix) {
        string.stream()
                .filter(s -> s.startsWith(prefix))
                .filter(set::contains)
                .forEach(System.out::println);
    }
}
