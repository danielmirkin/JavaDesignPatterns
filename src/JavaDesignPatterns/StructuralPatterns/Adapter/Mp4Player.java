package JavaDesignPatterns.StructuralPatterns.Adapter;

/**
 * Created by Unknown 2 on 24-Oct-16.
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+fileName);
    }
}
