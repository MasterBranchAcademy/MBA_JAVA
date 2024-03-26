package Test.Day_36.Practice_4;

public class Film {

    private String filmAdi;
    private String yonetmenAdi;
    private int vizyonYili;
    private String tur;

    public Film(String filmAdi, String yonetmenAdi, int vizyonYili, String tur) {
        this.filmAdi = filmAdi;
        this.yonetmenAdi = yonetmenAdi;
        this.vizyonYili = vizyonYili;
        this.tur = tur;
    }

    public String getFilmAdi() {
        return filmAdi;
    }

    public void setFilmAdi(String filmAdi) {
        this.filmAdi = filmAdi;
    }

    public String getYonetmenAdi() {
        return yonetmenAdi;
    }

    public void setYonetmenAdi(String yonetmenAdi) {
        this.yonetmenAdi = yonetmenAdi;
    }

    public int getVizyonYili() {
        return vizyonYili;
    }

    public void setVizyonYili(int vizyonYili) {
        this.vizyonYili = vizyonYili;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmAdi='" + filmAdi + '\'' +
                ", yonetmenAdi='" + yonetmenAdi + '\'' +
                ", vizyonYili=" + vizyonYili +
                ", tur='" + tur + '\'' +
                '}';
    }
}
