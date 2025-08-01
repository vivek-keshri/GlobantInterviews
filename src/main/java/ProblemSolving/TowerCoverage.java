package ProblemSolving;

/*
*
*   There is one rectangular Land, having different mobile towers of different Range
*   1)- find out area where coverage is available?
*   2)- find out area where coverage is not available?
*   3)- which DataStructure to use for same?
*
* */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
class Cordinates{
    int x,y;
}

@Data
@Builder
@AllArgsConstructor
class Land{
    int length,width;
}

public class TowerCoverage {
    public static void main(String[] args) {
        Land land = Land.builder().length(20).width(12).build();
        Map<Integer, Cordinates> towerLocations = new HashMap<Integer, Cordinates>();
        Cordinates tower1 = Cordinates.builder()
                .x(2)
                .y(2)
                .build();
        Cordinates tower2 = Cordinates.builder()
                .x(4)
                .y(5)
                .build();
        Cordinates tower3 = Cordinates.builder()
                .x(9)
                .y(4)
                .build();
        Cordinates tower4 = Cordinates.builder()
                .x(13)
                .y(8)
                .build();
        towerLocations.put(1, tower1);
        towerLocations.put(2, tower2);
        towerLocations.put(2, tower3);
        towerLocations.put(4, tower4);

        float landArea = land.getLength() * land.getWidth();

        TowerCoverage.findCoverageDetails(towerLocations, landArea);

    }

    private static void findCoverageDetails(Map towerLocations, Float landArea) {
        Double areaCoveredByTowers = towerLocations.keySet().stream().mapToDouble(x -> (int)x * (int) x * Math.PI).sum();
        System.out.println("Total Area of Land is :- " + landArea);
        System.out.println("Total Area covered By Tower is :- " + areaCoveredByTowers);
        System.out.println("Total Area Not covered By Tower is :- " + (landArea - areaCoveredByTowers.floatValue()));
    }

}
