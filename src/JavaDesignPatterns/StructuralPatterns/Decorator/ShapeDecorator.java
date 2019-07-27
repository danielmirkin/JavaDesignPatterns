package JavaDesignPatterns.StructuralPatterns.Decorator;

/**
 * Created by Unknown 2 on 24-Oct-16.
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;

    }

    public void draw(){
        decoratedShape.draw();
    }
}
