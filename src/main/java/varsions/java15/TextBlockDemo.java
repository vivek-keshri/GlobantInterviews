package varsions.java15;

public class TextBlockDemo {

    public static void main(String[] args) {

        System.out.println("prior to JDK 15");
        System.out.println("\"First Line\"\nSecondLine\nThirdLine");
        System.out.println("now with JDK 15");
        System.out.println("""
                           "First Line"
                           SecondLine
                           ThirdLine"""
        );

        String textBlock = """
                Line 1 : %s
                Line 2 : %s                
                Line 3 : %s
                Line 4 : %s
                """.formatted("Welcome to 1st Line","Welcome to 2nd Line","Welcome to 3rd Line","Welcome to 4th Line");

        String textBlockJSON = """
                [
                    {
                        "logNumber": 50,
                        "logName": "Freeform",
                        "feed": "A",
                        "logDate": "11/08/2021",
                        "logDay": "Mon",
                        "startTime": "06:00:00",
                        "programTitle": "Paid Programming",
                        "costPerSecond": 0.63,
                        "weightedAverageCost": 18.8,
                        "episodeNumber": 14082413,
                        "units": [
                            {
                                "unitId": 144932822,
                                "inventoryNumber": "1002530",
                                "isciCode": "700CLUBI",
                                "length": 10,
                                "orderNumber": 946372,
                                "comments": "700 CLUB AM PROMO",
                                "actualDate": "2021-11-08T06:00:00"
                            },
                            {
                                "unitId": 144932831,
                                "inventoryNumber": "1002530",
                                "isciCode": "700CLUBI",
                                "length": 10,
                                "orderNumber": 946372,
                                "comments": "700 CLUB AM PROMO",
                                "actualDate": "2021-11-08T06:30:04"
                            }
                        ]
                    }
                ]
                """;

        System.out.println(textBlock);
        System.out.println(textBlockJSON);
    }
}
