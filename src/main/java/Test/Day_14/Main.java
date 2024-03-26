package Test.Day_14;

public class Main {
    public static void main(String[] args) {


        UcgenAlan ucgenAlan = new UcgenAlan();

        //1. ucgen
        double taban = 10;
        double yukseklik = 5;

        double alanUcgen = ucgenAlan.alanHesapla(taban, yukseklik);

        System.out.println("alanUcgen : "+ alanUcgen);


    }


}
