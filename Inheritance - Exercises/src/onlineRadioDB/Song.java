package onlineRadioDB;

import onlineRadioDB.exceptions.*;

public class Song {

    private String artistName;
    private String songName;
    private String length;

    public Song(String artistName, String songName, String length) throws InvalidSongException {
        setArtistName(artistName);
        setSongName(songName);
        setLength(length);
    }

    private void setArtistName(String artistName) throws InvalidArtistNameException {
        if (artistName.length() < 3 || artistName.length() > 20) {
            throw new InvalidArtistNameException("Artist name should be between 3 and 20 symbols");
        }
        this.artistName = artistName;
    }

    public void setSongName(String songName) throws InvalidSongNameException {
        if (songName.length() < 3 || songName.length() > 30) {
            throw new InvalidSongNameException("Song name should be between 3 and 30 symbols.");
        }
        this.songName = songName;
    }

    public void setLength(String length) throws InvalidSongLengthException {
        String tokens[] = length.split(":");
        int minutes = Integer.parseInt(tokens[0]);
        int seconds = Integer.parseInt(tokens[1]);

        int time = seconds + (minutes * 60);
        if (time < 0 || time > 899) {
            throw new InvalidSongLengthException("Invalid song length.");
        }

        if (minutes < 0 || minutes > 14) {
            throw new InvalidSongMinutesException("Song minutes should be between 0 and 14.");
        }

        if (seconds < 0 || seconds > 59) {
            throw new InvalidSongSecondsException("Song seconds should be between 0 and 59.");
        }

        this.length = length;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSongName() {
        return songName;
    }

    public String getLength() {
        return length;
    }
}
