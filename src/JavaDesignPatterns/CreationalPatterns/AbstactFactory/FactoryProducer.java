package JavaDesignPatterns.CreationalPatterns.AbstactFactory;

/**
 * Created by Unknown 2 on 22-Oct-16.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }
        else if (choice.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }
        return null;
    }
}

