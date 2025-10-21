public class MusicPlayerSystem {
    public static void main(String[] args) {
        int iteration=1;

        MusicLibrary musicLibrary=new MusicLibrary();

        Playable playable1 = new MP3Player();
        Playable playable2 = new MP3Player();
        Playable playable3 = new CDPlayer();
        Playable playable4 = new CDPlayer();

        musicLibrary.addPlayable(playable1);
        musicLibrary.addPlayable(playable2);
        musicLibrary.addPlayable(playable3);
        musicLibrary.addPlayable(playable4);

        for(Playable playable:musicLibrary.getPlayables())
        {
            System.out.println("\n ****************************** AudioPlayer "+iteration+" ******************************************");
            System.out.println("****************************** "+playable.getClass().getSimpleName()+" :");
            musicLibrary.playPlayable(playable);

            musicLibrary.pausePlayable(playable);

            musicLibrary.stopPlayable(playable);

            iteration++;
        }

    }
}
