package JavaDesignPatterns.StructuralPatterns.Proxy;

/**
 * Created by Unknown 2 on 21-Feb-17.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("Test_image.jpg");

        //image is loaded from disk
        image.display();
        //image will not be loaded from the disk
        image.display();

    }
}
