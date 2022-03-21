package varsions.java12;


/**
 * till Java 12 Switch was executing from first matching statement till it finds break.
 * this was a flaw which has been enhanced in java 13.
 * below is demo if same.
 */
public class SwitchWithoutBreak {
    public static void main(String[] args) {
        SwitchWithoutBreak swb = new SwitchWithoutBreak();
        swb.runSwitch("messi");
    }

    private void runSwitch(String player){
        switch (player) {
            case "sachin" -> System.out.println("India");
            case "warne" -> System.out.println("Australia");
            case "flintoff" -> System.out.println("england");
            case "messi" -> System.out.println("Argentina");
            case "kane" -> System.out.println("NZ");
            case "Gibbs" -> System.out.println("SA");
            default -> throw new IllegalStateException("Unexpected value: " + player);
        }
    }
}
