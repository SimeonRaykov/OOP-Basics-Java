package onlineRadioDB;

import onlineRadioDB.exceptions.InvalidSongException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        SongDatabase songDB = new SongDatabase();

        for (int i = 0; i < n; i++) {
            String tokens[] = bf.readLine().split(";");
            try {
                Song song = new Song(tokens[0], tokens[1], tokens[2]);
                songDB.addSong(song);
                System.out.println("Song added.");
            } catch (InvalidSongException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Songs added: "+songDB.getTotalLengthOfSongs());
        System.out.println(songDB.getTotalLengthOfPlaylist());


    }
}
