package JavaDesignPatterns.BehavioralPatterns.ChainOfResponsibility;

/**
 * Created by Unknown 2 on 22-Feb-17.
 */
public class ErrorLogger extends AbstractLogger{
    
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
