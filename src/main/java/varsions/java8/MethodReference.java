package varsions.java8;

public class MethodReference {

    public static void implementThread(){
        for (int i=0;i<10;i++){
            System.out.println("Child Thread ::"+i+"str");
        }
    }

    public static void main(String[] args) {
        Runnable r = MethodReference::implementThread;
        Thread t = new Thread(r);
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("Main Thread ::"+i);
        }

    }



}
