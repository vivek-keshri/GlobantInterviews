package varsions.java8.strams;

// Print “Hello” + a/b/c/d/e  using lambda expression.
// assume a,b,c,d,e is in a separate list.


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@EqualsAndHashCode
class Temp{
    int first;
    String second;
}

public class PrintHelloabcde {
    public static void main(String[] args) {
        List<Character> charList = List.of('a', 'b', 'c', 'd', 'e');
        List<Temp> list = List.of(new Temp(300,"N"),
                new Temp(300,"N"),
                new Temp(300,"Y"),
                new Temp(300,"N"),
                new Temp(200,"Y"),
                new Temp(200,"N"),
                new Temp(200,"N"),
                new Temp(100,"N"),
                new Temp(100,"N"),
                new Temp(100,"Y"));
        Map<Integer,String> map_to_be_returned = new HashMap<>();
       /* System.out.print("Hello ");
        charList.stream().forEach(n -> {
            System.out.print(n);
            if (charList.indexOf(n) != (charList.size() - 1)) {
                System.out.print("/");
            }
        });*/

        list.forEach(n -> {
            if (map_to_be_returned.containsKey(n.getFirst())) {
                if(map_to_be_returned.get(n.getFirst()).equals("N")){
                    map_to_be_returned.put(n.getFirst(),n.getSecond());
                }
            }
            else{
                map_to_be_returned.put(n.getFirst(),n.getSecond());
            }
        });
        System.out.println(map_to_be_returned);
    }
}
