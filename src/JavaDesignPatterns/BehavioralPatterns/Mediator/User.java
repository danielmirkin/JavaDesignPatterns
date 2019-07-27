package JavaDesignPatterns.BehavioralPatterns.Mediator;

/**
 * Created by Unknown 2 on 28-Feb-17.
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
