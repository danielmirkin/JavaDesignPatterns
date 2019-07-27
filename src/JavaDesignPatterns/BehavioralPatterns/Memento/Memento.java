package JavaDesignPatterns.BehavioralPatterns.Memento;

/**
 * Created by Unknown 2 on 13-Mar-17.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;

    }

    public String getState(){
        return state;
    }
}
