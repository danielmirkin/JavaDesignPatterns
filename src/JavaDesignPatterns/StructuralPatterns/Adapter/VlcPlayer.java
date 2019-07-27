package JavaDesignPatterns.StructuralPatterns.Adapter;

/**
 * Created by Unknown 2 on 24-Oct-16.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
