package varsions.java16;

public class RecordsDemo {
    public record Person(String name,String email,String phoneNumber){}
    public static void main(String[] args) {
        Person p = new Person("vivek","vivek@gmail.com","1234567890");
        Person p1 = new Person("vivek","vivek@gmail.com","1234567890");
        Person p2 = new Person("keshri","keshri@gmail.com","2345678901");

        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p.equals(p1));
        System.out.println(p.equals(p2));

        System.out.println(p.name);
        System.out.println(p.name());

        System.out.println(p.hashCode());


    }


}
