package Test.Day_36.Practice_3;

public class Album {

    private String albumName;
    private String artisName;
    private int releaseYear;
    private String genre;

    public Album(String albumName, String artisName, int releaseYear, String genre) {
        this.albumName = albumName;
        this.artisName = artisName;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtisName() {
        return artisName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setArtisName(String artisName) {
        this.artisName = artisName;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumName='" + albumName + '\'' +
                ", artisName='" + artisName + '\'' +
                ", releaseYear=" + releaseYear +
                ", genre='" + genre + '\'' +
                '}';
    }
}
