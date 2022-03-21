package varsions.java8.strams;

import java.util.List;

/**
 * When we are processing object, we may need to convert it
 * to another object of different type using functions or
 * acquire different kind of object using it like getting nested object in it.
 * map is used to do same.
 */
public class Map {

    public static void main(String[] args) {
        Player sachin = Player.builder()
                .name("Sachin")
                .age(30)
                .build();
        Player sahwag = Player.builder()
                .name("sahwag")
                .age(29)
                .build();
        Player yuvraj = Player.builder()
                .name("yuvraj")
                .age(28)
                .build();
        Team team = Team.builder()
                        .name("Blue")
                        .players(List.of(sachin,sahwag,yuvraj))
                        .build();
        Team team1 = Team.builder()
                .name("BluePanther")
                .players(List.of(sachin,sahwag,yuvraj))
                .build();
        Team team2 = Team.builder()
                .name("TeamBlue")
                .players(List.of(sachin,sahwag,yuvraj))
                .build();
        printTeamNamesStartingWith(List.of(team,team1,team2),"Blue");
    }

    private static void printTeamNamesStartingWith(List<Team> teams, String prefix) {
        teams
                .stream()
                .map(Team::getName) // method reference
                .filter(name -> name.startsWith(prefix))
                .forEach(System.out::println);
    }
}
