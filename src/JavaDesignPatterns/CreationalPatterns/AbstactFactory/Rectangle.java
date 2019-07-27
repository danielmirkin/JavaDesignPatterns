package JavaDesignPatterns.CreationalPatterns.AbstactFactory;

/**
 * Created by Unknown 2 on 22-Oct-16.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
