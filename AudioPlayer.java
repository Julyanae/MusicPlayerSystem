public abstract class AudioPlayer implements Playable {
    protected int volume;

    public AudioPlayer()
    {
        this.volume=50;
    }

    public void increaseVolume()
    {
        if(this.volume<100)
        {
            this.volume++;
        }
        System.out.println("Volume increased to : "+this.volume);
    }

    public void decreaseVolume()
    {
        if(this.volume>0)
        {
            this.volume--;
        }
        System.out.println("Volume decreased to : "+this.volume);
    }
}
