package JavaDesignPatterns.CreationalPatterns.AbstactFactory;

/**
 * Created by Unknown 2 on 22-Oct-16.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::Fill() method.");
    }
}
