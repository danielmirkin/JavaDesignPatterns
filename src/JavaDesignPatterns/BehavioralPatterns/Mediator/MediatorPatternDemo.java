package JavaDesignPatterns.BehavioralPatterns.Mediator;

/**
 * Created by Unknown 2 on 28-Feb-17.
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User daniel = new User("Daniel");
        User orly = new User("Orly");

        daniel.sendMessage("Hi Orly");
        orly.sendMessage("Hi Daniel");
    }
}
