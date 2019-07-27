package JavaDesignPatterns.BehavioralPatterns.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Unknown 2 on 13-Mar-17.
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
