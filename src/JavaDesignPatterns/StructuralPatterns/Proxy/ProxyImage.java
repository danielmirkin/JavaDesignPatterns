package JavaDesignPatterns.StructuralPatterns.Proxy;

/**
 * Created by Unknown 2 on 21-Feb-17.
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null)
            realImage = new RealImage(fileName);
        realImage.display();
    }


}
