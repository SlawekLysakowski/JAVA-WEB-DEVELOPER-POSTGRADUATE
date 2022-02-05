package Laboratorium15;

public class ImprovedCDPlayer extends MusicPlayer{

    Song[] playlist = {
            new Song("John Bon Jovi", "It's my life", "One"),
            new Song("Mettalica", "Nothing else matters", "Nothing else matters"),
            new Song("Eminem", "Stam","Greatest Hits")
    };

    int song = 0;


    public void play() {
        System.out.println("muzyka gra z CD");
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

        ImprovedCDPlayer cdPlayer = new ImprovedCDPlayer();
//        cdPlayer.play();
        cdPlayer.nextSong();
        cdPlayer.nextSong();
        cdPlayer.nextSong();
        cdPlayer.nextSong();
        cdPlayer.nextSong();





    }
}
