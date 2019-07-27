package JavaDesignPatterns.StructuralPatterns.Decorator;

/**
 * Created by Unknown 2 on 24-Oct-16.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}