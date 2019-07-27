package JavaDesignPatterns.StructuralPatterns.Facade;

/**
 * Created by Unknown 2 on 13-Feb-17.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw)");
    }
}
