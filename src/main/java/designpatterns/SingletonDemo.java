package designpatterns;

class Singleton {
    private static volatile Singleton _instance;
        private Singleton(){

    }
    /**
     * Double checked locking code on Singleton
     * @return Singelton instance
     */
    public static Singleton getInstance() {
        if (_instance == null) {
            //synchronized(Singleton.class) {
                //if (_instance == null) {
                    _instance = new Singleton();
                //}
            //}
        }
        return _instance;
    }
}

public class SingletonDemo {
    public static void main(String args[]){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton s1 = Singleton.getInstance();
                Singleton s2 = Singleton.getInstance();
                Singleton s3 = Singleton.getInstance();
                System.out.println(s1.hashCode());
                System.out.println(s2.hashCode());
                System.out.println(s3.hashCode());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton s1 = Singleton.getInstance();
                Singleton s2 = Singleton.getInstance();
                Singleton s3 = Singleton.getInstance();
                System.out.println(s1.hashCode());
                System.out.println(s2.hashCode());
                System.out.println(s3.hashCode());
            }
        });
        thread2.start();
        thread.start();


    }
}


