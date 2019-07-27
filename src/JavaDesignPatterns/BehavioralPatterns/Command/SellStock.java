package JavaDesignPatterns.BehavioralPatterns.Command;

/**
 * Created by Unknown 2 on 26-Feb-17.
 */
public class SellStock implements Order{
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
