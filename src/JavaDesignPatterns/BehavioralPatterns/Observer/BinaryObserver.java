package JavaDesignPatterns.BehavioralPatterns.Observer;

/**
 * Created by Unknown 2 on 24-Oct-16.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
