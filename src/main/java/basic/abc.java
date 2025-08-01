package basic;

/*class Calculator{
    interface IntegerMath{
        int operation(int a, int b);
    }

    public int operatorBinary(int a, int b, IntegerMath op){
        return op.operation(a,b);
    }

    public static void main(String[] args) {
        Calculator myApp = new Calculator();
        IntegerMath addition = (a,b)->a+b;
        IntegerMath substraction = (a,b)->a-b;
        System.out.println(myApp.operatorBinary(40,2,addition));
        System.out.println(myApp.operatorBinary(40,2,substraction));

        final String str ="Test";
        str.chars().forEach(ch-> System.out.println(ch));

    }
}*/

class newthread extends Thread
{
    Thread t;
    String name;
    newthread(String threadname)
    {
        name = threadname;
        t = new Thread(this,name);
        t.start();
    }
    public void run()
    {
    }

}
class multithreaded_programing
{
    public static void main(String args[])
    {
        newthread obj1 =      new newthread("one");
        newthread obj2 =     new newthread("two");
        try
        {
            Thread.sleep(1000);
            System.out.print(obj1.t.isAlive());
        }
        catch(InterruptedException e)
        {
            System.out.print("Main thread interrupted");
        }
    }
}
