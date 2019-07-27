package JavaDesignPatterns.BehavioralPatterns.Interpreter;

/**
 * Created by Unknown 2 on 27-Feb-17.
 */
public class InterpreterPatternDemo {

    //Rule: Daniel and Yossi are male

    public static Expression getMaleExpression(){
        Expression daniel = new TerminalExpression("Daniel");
        Expression yossi = new TerminalExpression("Yossi");
        return new orExpression(daniel,yossi);
    }

    //Rule: Orly is a married woman
    public static Expression getMarriedWomanExpression(){
        Expression orly = new TerminalExpression("Orly");
        Expression married = new TerminalExpression("Married");

        return new AndExpression(orly, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("Daniel is male? " + isMale.interpret("Daniel"));
        System.out.println("Orly is a married woman? " + isMarriedWoman.interpret(
                ("Married Orly")));
    }
}
