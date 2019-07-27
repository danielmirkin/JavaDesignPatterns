package JavaDesignPatterns.CreationalPatterns.Singleton;

/**
 * Created by Unknown 2 on 22-Oct-16.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("Singleton object created");
    }
}
