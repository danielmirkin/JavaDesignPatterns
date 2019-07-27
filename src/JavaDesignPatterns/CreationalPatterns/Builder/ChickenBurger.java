package JavaDesignPatterns.CreationalPatterns.Builder;

/**
 * Created by Unknown 2 on 24-Oct-16.
 */
public class ChickenBurger extends Burger{
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
