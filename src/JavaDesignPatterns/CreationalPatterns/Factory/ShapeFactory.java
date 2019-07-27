package JavaDesignPatterns.CreationalPatterns.Factory;


/**
 * Created by Unknown 2 on 22-Oct-16.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;

        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }


}
