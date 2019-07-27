package JavaDesignPatterns.BehavioralPatterns.ChainOfResponsibility;

/**
 * Created by Unknown 2 on 22-Feb-17.
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an info");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is debug level info");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error message");
    }
}
