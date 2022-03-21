package varsions.java8.strams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * There is another important mapping method called flatMap.
 * With the help of this method, we can convert a stream of a type to a stream of another type through streamable object (list, set etc)
 * like converting team stream to team’s players stream. It basically expects you to provide a stream as a parameter.
 */
public class FlatMap {
    public static void main(String[] args) {
        Player sachin = Player.builder()
                .name("Sachin")
                .age(30)
                .build();
        Player sahwag = Player.builder()
                .name("sahwag")
                .age(26)
                .build();
        Player yuvraj = Player.builder()
                .name("yuvraj")
                .age(22)
                .build();
        Player kohli = Player.builder()
                .name("kohli")
                .age(18)
                .build();
        Player kuldeep = Player.builder()
                .name("kuldeep")
                .age(15)
                .build();
        Player chahal = Player.builder()
                .name("chahal")
                .age(14)
                .build();
        Team team = Team.builder()
                .name("Blue")
                .players(List.of(sachin,sahwag))
                .build();
        Team team1 = Team.builder()
                .name("BluePanther")
                .players(List.of(kohli,kuldeep))
                .build();
        Team team2 = Team.builder()
                .name("TeamBlue")
                .players(List.of(chahal,yuvraj))
                .build();
        printPlayersAgedGreaterThan20(List.of(team,team1,team2));
    }

    private static void printPlayersAgedGreaterThan20(List<Team> teams) {
        List<Player> collection_of_seniors = teams
                .stream()
                .flatMap(team -> team.getPlayers().stream())
                .filter(player -> player.getAge() > 20)
                .collect(Collectors.toList());
        System.out.println(collection_of_seniors);

    }
}
