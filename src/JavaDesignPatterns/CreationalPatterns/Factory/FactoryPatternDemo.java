package JavaDesignPatterns.CreationalPatterns.Factory;

/**
 * Created by Unknown 2 on 22-Oct-16.
 */
public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1= shapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2= shapeFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3= shapeFactory.getShape("Square");
        shape3.draw();
    }
}
