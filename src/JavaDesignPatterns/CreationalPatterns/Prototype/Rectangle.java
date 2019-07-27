package JavaDesignPatterns.CreationalPatterns.Prototype;

import java.awt.*;

/**
 * Created by Unknown 2 on 24-Oct-16.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
