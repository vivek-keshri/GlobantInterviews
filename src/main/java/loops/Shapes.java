package loops;

public class Shapes {
    public static void main(String[] args) {
        /*System.out.println("Shape 1 \n");
        System.out.println();
        for(int r=0;r<=4;r++){
            for(int c=0;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n Shape 2 \n ");

        for(int r=0;r<=4;r++){
            for(int c=r;c<=4;c++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n Shape 3 \n");
        for(int r=0;r<=4;r++){
            for(int c=r;c<=4;c++){
                System.out.print(" ");
            }

            for(int c=0;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n Shape 4 \n");
        for(int r=0;r<=4;r++){
            for(int c=0;c<r;c++){
                System.out.print(" ");
            }
            for(int c=r;c<=4;c++){
                System.out.print("*");
            }


            System.out.println();
        }*/

        System.out.println("\n Diamond \n");

        for(int r=0;r<=4;r++){
            for(int c=r;c<=4;c++){
                System.out.print(" ");
            }
            for(int c=0;c<=r;c++){
                System.out.print("*");
            }
            for(int c=1;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int r=1;r<=4;r++){
            System.out.print(" ");
            for(int c=0;c<r;c++){
                System.out.print(" ");
            }
            for(int c=r;c<=4;c++){
                System.out.print("*");
            }
            for(int c=r+1;c<=4;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
