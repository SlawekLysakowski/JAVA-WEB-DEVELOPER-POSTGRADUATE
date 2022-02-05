package Laboratorium15;

public class ImprovedMP3Player extends MusicPlayer{

    Song[] playlist = {
            new Song("Radwimps", "nandemonai ya", "okazu no gohan"),
            new Song("Hyde", "blurry eyes", "Blurry eyes"),
            new Song("Eminem", "Stam","Greatest Hits")
    };

    int song = 0;

    @Override
    public void play() {
        System.out.println("muzyka gra z MP3");
        System.out.println(playlist[song]);
    }

    @Override
    public void pauseStop() {
        System.out.println("cisza");
    }

    @Override
    public void nextSong() {
        song++;
        if (song == playlist.length) {
            song = 0;
        }
          play();
    }

    @Override
    public void previousSong() {
        song--;
        if (song == -1) {
            song = playlist.length -1;
        }
        play();
    }


    public static void main(String[] args) {

        ImprovedMP3Player mp3Player = new ImprovedMP3Player();
        mp3Player.play();
        mp3Player.nextSong();
        mp3Player.nextSong();
        mp3Player.nextSong();
        mp3Player.nextSong();
        mp3Player.previousSong();
        mp3Player.previousSong();
        mp3Player.previousSong();
        mp3Player.previousSong();
        mp3Player.previousSong();


    }

}
