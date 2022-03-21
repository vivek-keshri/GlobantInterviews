package varsions.java14;

public class NPEDemo {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Vivek")
                .age(32)
                .build();

        Person person1 = Person.builder()
                .name(null)
                .age(32)
                .build();

        Person person2 = null;

        System.out.println(person.getName().toLowerCase());
        //System.out.println(person1.getName().toLowerCase());
        System.out.println(person2.getName().toLowerCase());
    }
}
