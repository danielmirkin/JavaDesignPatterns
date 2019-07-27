package JavaDesignPatterns.BehavioralPatterns.Observer;

/**
 * Created by Unknown 2 on 24-Oct-16.
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }

}
