package varsions.java12;

import junit.framework.Assert;
import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teeing {

    @Test
    public void givenSetOfNumbers_thenCalculateAverage() {
        double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
                        Collectors.counting(), (sum, count) -> sum / count));
        Assert.assertEquals(3.0, mean);
    }
}
