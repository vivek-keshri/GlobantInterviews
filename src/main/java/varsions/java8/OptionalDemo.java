package varsions.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> str_list = new ArrayList<>();
        //str_list.add("vivek");
        str_list.add(null);
        str_list.add(null);
        //str_list.add("keshri");
        System.out.println(str_list.size());
        System.out.println(str_list);

        Optional<String> optional = Optional.ofNullable(str_list.get(0));
        System.out.println(optional);
        str_list.stream().filter(Objects::nonNull)
                .map(s->s.toString().toUpperCase())
                .forEach(System.out::println);

    }



}
