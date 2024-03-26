package Test.Day_23.Pack_5;

public class Main {
    public static void main(String[] args) {

        double [] ogrenciPuanListesi = {75, 80, 30, 67.6, 100};
        double ortalama = ogrenciPuanOrtalamasi(ogrenciPuanListesi);
        System.out.println("ortalama : " + ortalama);
    }

    public static double ogrenciPuanOrtalamasi(double [] ogrenciPuanListesi){
        double toplam = 0;
        for (int i = 0; i <ogrenciPuanListesi.length ; i++) {
            toplam = toplam + ogrenciPuanListesi[i];
        }
        double ortalama = toplam/ogrenciPuanListesi.length;
        return ortalama;
    }


}
