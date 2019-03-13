package onlineRadioDB;

import java.util.ArrayList;
import java.util.List;

public class SongDatabase {

    private List<Song> songs;

    public SongDatabase() {
        this.songs = new ArrayList<>();
    }

    public String getTotalLengthOfPlaylist() {
        int time = 0;
        for (Song song : songs) {
            String[] tokens = song.getLength().split(":");

            time += (Integer.parseInt(tokens[0]) * 60) + Integer.parseInt(tokens[1]);

        }

        int hours = time / 3600;
        int minutes = (time - hours * 3600) / 60;
        int seconds = (time - hours * 3600) - minutes * 60;

        return "Playlist length: " + hours + "h " + minutes + "m " + seconds + "s";

    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public int getTotalLengthOfSongs() {
        return this.songs.size();
    }

}
