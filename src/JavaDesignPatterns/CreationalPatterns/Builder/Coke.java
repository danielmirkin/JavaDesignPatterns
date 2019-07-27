package JavaDesignPatterns.CreationalPatterns.Builder;

/**
 * Created by Unknown 2 on 24-Oct-16.
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
