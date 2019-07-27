package JavaDesignPatterns.BehavioralPatterns.ChainOfResponsibility;

/**
 * Created by Unknown 2 on 22-Feb-17.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger (int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
