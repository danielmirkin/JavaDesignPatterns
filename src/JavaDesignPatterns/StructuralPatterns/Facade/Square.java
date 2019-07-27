package JavaDesignPatterns.StructuralPatterns.Facade;

/**
 * Created by Unknown 2 on 13-Feb-17.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
