package JavaDesignPatterns.BehavioralPatterns.ChainOfResponsibility;

import java.io.File;

/**
 * Created by Unknown 2 on 22-Feb-17.
 */

public class FileLogger extends AbstractLogger{

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
