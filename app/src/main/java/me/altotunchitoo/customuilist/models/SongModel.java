package me.altotunchitoo.customuilist.models;

public class SongModel {
    private String songName, songArtist, songDuration;
    private int songImage;

    public SongModel(String songName, String songArtist, int songImage, String songDuration) {
        this.songName = songName;
        this.songArtist = songArtist;
        this.songImage = songImage;
        this.songDuration = songDuration;
    }

    public String getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(String songDuration) {
        this.songDuration = songDuration;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    public int getSongImage() {
        return songImage;
    }

    public void setSongImage(int songImagePath) {
        this.songImage = songImage;
    }
}
