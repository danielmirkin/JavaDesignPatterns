package JavaDesignPatterns.CreationalPatterns.AbstactFactory;

/**
 * Created by Unknown 2 on 22-Oct-16.
 */
public class ShapeFactory extends AbstractFactory {
    @Override

    public Shape getShape(String shapeType) {
        if (shapeType == null)
             return null;


        if (shapeType.equalsIgnoreCase("Circle"))

        {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("Rectangle"))

        {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square"))

        {
            return new Square();
        }
        return null;
    }
    @Override
    Color getColor(String color) {
        return null;
    }
}
