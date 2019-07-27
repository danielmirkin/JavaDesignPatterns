package JavaDesignPatterns.CreationalPatterns.Prototype;

/**
 * Created by Unknown 2 on 24-Oct-16.
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
