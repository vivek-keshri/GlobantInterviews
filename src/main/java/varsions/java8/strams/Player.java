package varsions.java8.strams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Builder
@AllArgsConstructor

public class Player {
    private String name;
    private int age;
}
