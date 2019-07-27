package JavaDesignPatterns.CreationalPatterns.Prototype;

/**
 * Created by Unknown 2 on 24-Oct-16.
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";

    }
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
