package JavaDesignPatterns.CreationalPatterns.Builder;

/**
 * Created by Unknown 2 on 24-Oct-16.
 */
public class VegBurger extends Burger{
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
