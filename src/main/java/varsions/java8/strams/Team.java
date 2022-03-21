package varsions.java8.strams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

// lombok annotations used
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Team {
    private String name;
    private List<Player> players;

}

