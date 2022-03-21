package basic;

class Robot{
    int x,y;

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    Robot(int h, int v){
        this.x = h;
        this.y = v;
    }
    void U(){
        this.y++;
    }
    void D(){
        this.y--;
    }
    void R(){
        this.x++;
    }
    void L(){
        this.x--;
    }
}

public class RobotMovement {
    public static void main(String[] args) {
        Robot robot = new Robot(0,0);
        Robot moved_robot = MoveRobot("URDLURURURURDDD",robot);
        System.out.println(moved_robot);
    }

    private static Robot MoveRobot(String str,Robot r) {
        char[] chars = str.toCharArray();
        for(char c:chars){
            switch(String.valueOf(c)){
                case "L":r.L();break;
                case "R":r.R();break;
                case "U":r.U();break;
                case "D":r.D();break;
                default:
                    System.out.println("Not Matching Move");
            }

        }
    return r;
    }

}
