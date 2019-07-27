package JavaDesignPatterns.BehavioralPatterns.Observer;


/**
 * Created by Unknown 2 on 24-Oct-16.
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }

}
