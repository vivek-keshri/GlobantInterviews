package varsions.java8;

interface Interf{
    public void add(int a,int b);
}
public class MethodReferenceDemo {

    public static void sum(int a,int b){
        System.out.println("the Sum from Implementation Method reference ::"+(a+b));
    }

    public static void main(String[] args) {
        Interf i1 = (a,b) -> System.out.println("The Sum from Lambda ::"+(a+b));
        i1.add(10,20);

        Interf i2 = MethodReferenceDemo::sum;
        i2.add(100,200);
    }
}
