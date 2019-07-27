package JavaDesignPatterns.BehavioralPatterns.Command;

/**
 * Created by Unknown 2 on 26-Feb-17.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
