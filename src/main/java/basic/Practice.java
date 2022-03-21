package basic;

class Demo{
    public void m1(String str){
        System.out.println("Welcome from String");
    }

    public void m1(Object obj){
        System.out.println("Welcome from Object");
    }

}
public class Practice {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.m1(null);
    }




}
