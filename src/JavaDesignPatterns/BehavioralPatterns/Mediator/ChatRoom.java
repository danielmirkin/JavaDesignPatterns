package JavaDesignPatterns.BehavioralPatterns.Mediator;

import java.util.Date;

/**
 * Created by Unknown 2 on 28-Feb-17.
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() +"} : " + message);
    }
}
