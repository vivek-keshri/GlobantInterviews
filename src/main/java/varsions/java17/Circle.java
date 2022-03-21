package varsions.java17;

public sealed class Circle extends Shape permits ExtendedCircle{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
