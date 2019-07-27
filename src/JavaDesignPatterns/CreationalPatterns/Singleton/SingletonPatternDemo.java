package JavaDesignPatterns.CreationalPatterns.Singleton;

/**
 * Created by Unknown 2 on 22-Oct-16.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) { //psvm
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
