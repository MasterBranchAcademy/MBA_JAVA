package Test.Day_12;

public class Practice_3 {
    public static void main(String[] args) {
            double vizeNotu = 80;
            double finalNotu = 90;

            double ortalama = ortalamaHesapla(vizeNotu, finalNotu);//86.0
            System.out.println("ortalama: " + ortalama);
    }

    public static double ortalamaHesapla(double vizeNotu, double finalNotu){
            double ortalama = (vizeNotu * 0.4) + (finalNotu * 0.6);
            return ortalama;
    }
}
