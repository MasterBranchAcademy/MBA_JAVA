package Test.Day_36.Practice_4;

public class Main {
    public static void main(String[] args) {

        Film film = new Film("Adventure Quest","Cinema Master",2023,"Macera");

        System.out.println(film.getYonetmenAdi());
        System.out.println(film.getFilmAdi());

        film.setVizyonYili(2024);
        film.setTur("Bilim kurgu");

        System.out.println(film.getVizyonYili());
        System.out.println(film.getTur());


        System.out.println(film.toString());

    }
}
