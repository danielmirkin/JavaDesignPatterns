package JavaDesignPatterns.BehavioralPatterns.Interpreter;

/**
 * Created by Unknown 2 on 27-Feb-17.
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

   @Override
    public boolean interpret(String context) {
       if (context.contains(data))
           return true;
        return false;
    }

}
