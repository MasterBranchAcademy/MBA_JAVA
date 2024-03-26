package Test.Day_15.Pratik_4;

public class Ev {

    public static void main(String[] args) {

        Ahmet ahmet = new Ahmet();
        Ayse ayse = new Ayse();

        double toplamGelir = ahmet.ahmetGelir() + ayse.ayseGelir();

        System.out.println("toplamGelir : " + toplamGelir);

    }
}
