package designpatterns;

import java.util.concurrent.TimeUnit;

class Test
{
    public static void main(String[] args) {
    String currentTime = "12:13:14";
    //String currentTime = "23:59:59";
        // String currentTime = "01:01:01";
        int timeInSeconds = convertTimeInSeconds(currentTime);
        //System.out.println("Time in Seconds :: "+timeInSeconds);
        System.out.println(Math.round(Double.parseDouble("2.49")));
        System.out.println(Math.round(Double.parseDouble("2.51")));
    }

    private static int convertTimeInSeconds(String currentTime) {
        String[] hhmmssValue = currentTime.split(":");
        Long timeInSeconds = (TimeUnit.HOURS.toSeconds(Long.parseLong(hhmmssValue[0])) + TimeUnit.MINUTES.toSeconds(Long.parseLong(hhmmssValue[1])) + Long.parseLong(hhmmssValue[2]));
    return timeInSeconds.intValue();
    }



}

