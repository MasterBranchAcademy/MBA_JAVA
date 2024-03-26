package Test.Day_15.Pratik_5;

public class Ev {
    public static void main(String[] args) {

        YatakOdasi yatakOdasi = new YatakOdasi();
        OturmaOdasi oturmaOdasi = new OturmaOdasi();
        Banyo banyo = new Banyo();

        double toplamAlan = yatakOdasi.hesaplaKareAlan() + oturmaOdasi.hesaplaDikdortgenAlan() + banyo.hesaplaUcgenAlan();

        System.out.println("toplamAlan : " + toplamAlan);
    }
}
