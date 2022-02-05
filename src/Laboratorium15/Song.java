package Laboratorium15;

public class Song {
    private String artist;
    private String title;
    private String album;

    public Song(String artist, String title, String album) {
        this.title = title;
        this.artist = artist;
        this.album = album;
    }


    @Override
    public String toString() {
        return "Song: " + artist + " " + title + " from album " + album + ";";
    }
}
