package varsions.java14;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Builder
public class Person {
    private String name;
    private Integer age;
}
