package Test.Day_36.Practice_3;

public class Main {
    public static void main(String[] args) {

        Album album = new Album("Summer vibes","Sunny artist",2023,"Pop");

        String albumAdi = album.getAlbumName();
        String artistAdi = album.getArtisName();

        System.out.println("albumAdi: " + albumAdi);
        System.out.println("artistAdi: " + artistAdi);

        album.setReleaseYear(2024);
        album.setGenre("Electronic");

        System.out.println("Release year: " + album.getReleaseYear());
        System.out.println("Genre       : " + album.getGenre());

        System.out.println(album.toString());
    }
}
