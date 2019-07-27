package JavaDesignPatterns.CreationalPatterns.Factory;

/**
 * Created by Unknown 2 on 22-Oct-16.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
