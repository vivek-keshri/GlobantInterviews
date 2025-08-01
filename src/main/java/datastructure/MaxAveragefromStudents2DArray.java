package datastructure;

import java.util.Arrays;
import java.util.List;

import static java.lang.Double.parseDouble;
import static java.util.Comparator.naturalOrder;
import static java.util.stream.Collectors.*;

public class MaxAveragefromStudents2DArray {
    public static void main(String[] args) {

        String[][] scores = { { "Amit", "70.00" },{ "Amit", "70.00" },{ "Amit", "70.00" },{ "Amit", "70.00" },{ "Amit", "70.00" }, { "Arthit", "60.00" }, { "Peter", "60.45" }, { "Arthit", "100.29" } };
        String[][] scores_negative = { { "Amit", "-70.00" }, { "Arthit", "-60.00" }, { "Peter", "-60.45" }, { "Arthit", "-100.29" } };

        double highestAvg = Arrays.stream(scores)
                .collect(groupingBy(s -> s[0],
                        averagingDouble(s -> parseDouble(s[1]))))
                .values()
                .stream()
                .max(naturalOrder())
                .get();

        Long highestOccurrences = Arrays.stream(scores)
                .collect(groupingBy(s -> s[0],counting()))
                .values()
                .stream()
                .max(naturalOrder())
                .get();

        double mean = Arrays.stream(scores)
              .collect(teeing(summingDouble(s -> parseDouble(s[1])),
              counting(), (sum, count) -> sum / count));

        System.out.println(Math.floor(highestAvg));
        System.out.println(highestOccurrences);
        System.out.println(mean);

        List<Integer> number = Arrays.asList(2,3,4,5);
        int even = number.stream().filter(x->x%2==0).reduce(0,(value,i) -> value+i);
        System.out.println(even);
    }
}
