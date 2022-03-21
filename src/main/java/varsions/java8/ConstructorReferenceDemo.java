package varsions.java8;

class Sample{
    Sample(String s){
        System.out.println("Sample Class Constructor Execution......with argument :: "+s);
    }
}

interface Interface{
    public Sample get(String s);
}
public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        Interface i = Sample::new;
        Sample s1 = i.get("Hello");
        Sample s2 = i.get("Motto");
        Sample s3 = i.get("Mobile");
        Sample s4 = i.get("is");
        Sample s5 = i.get("very Good");
    }
}
