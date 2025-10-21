import java.util.ArrayList;

public class MusicLibrary {

    private ArrayList<Playable> playables;

    public MusicLibrary()
    {
        this.playables=new ArrayList<>();
    }

    public void addPlayable(Playable playable)
    {
        this.playables.add(playable);
    }

    public void playPlayable(Playable playable)
    {
        playable.play();
    }

    public void pausePlayable(Playable playable)
    {
        playable.pause();
    }

    public void stopPlayable(Playable playable)
    {
        playable.stop();
    }

    public ArrayList<Playable> getPlayables()
    {
        return this.playables;
    }

}
