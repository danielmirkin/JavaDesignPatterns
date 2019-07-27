package JavaDesignPatterns.StructuralPatterns.Facade;

/**
 * Created by Unknown 2 on 13-Feb-17.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
