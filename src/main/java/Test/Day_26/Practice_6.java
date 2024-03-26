package Test.Day_26;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz:");
        String girilenCumle = scanner.nextLine();
       double ortalama = ortalamaKarakterUzunlugu(girilenCumle);
        System.out.println("ortalama : " + ortalama);
    }

    public static double ortalamaKarakterUzunlugu(String girilenCumle){
        String [] kelimeler = girilenCumle.split(" ");
        double toplam =0;
        for (String kelime:kelimeler) {
            int karakterSayisi = kelime.length();
            toplam+= karakterSayisi;
        }
        double ortalama = toplam/ kelimeler.length;
        return ortalama;
    }
}
