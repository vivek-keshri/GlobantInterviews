package varsions.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    private static List<Employee> empList = Arrays.asList(arrayOfEmps);

    public static void main(String[] args) {
        //ystem.out.println( Stream.of(arrayOfEmps));
        //System.out.println(empList.stream());
        //Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);

        /*Stream.Builder<Employee> empStreamBuilder = Stream.builder();

        empStreamBuilder.accept(arrayOfEmps[0]);
        empStreamBuilder.accept(arrayOfEmps[1]);
        empStreamBuilder.accept(arrayOfEmps[2]);

        Stream<Employee> empStream = empStreamBuilder.build();
        System.out.println(empStream);*/

        /*List<Employee> employees = empList.stream().collect(Collectors.toList());
        System.out.println(empList.get(0) == employees.get(0));*/

        /*Stream.of(1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,0)
                .takeWhile(x -> x <= 9)
                .forEach(System.out::println);*/
        List<List<String>> nestedList = new ArrayList<>();
        nestedList.add(List.of("Hello","From"));
        nestedList.add(List.of("Globant","Pune"));

        List<String> collect = Stream
                .of("Hello", "from", "Globant")
                .map(s -> s.toUpperCase()).collect(Collectors.toList());

        List<String> collect1 = nestedList
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(collect1);
    }


}


