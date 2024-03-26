package Test.Day_18;

import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz:");
        String kelime = scanner.nextLine();

        System.out.println("kelime : " + kelime);

        int girilenKelimeninUzunlugu = kelime.length();
        System.out.println("girilenKelimeninUzunlugu : " + girilenKelimeninUzunlugu);

        if(girilenKelimeninUzunlugu > 5){
            String kelimeninIlkUcHarfi = kelime.substring(0,3);
            System.out.println("kelimeninIlkUcHarfi : " + kelimeninIlkUcHarfi);

        }else if(girilenKelimeninUzunlugu <= 5){
            String kelimeninSonIkiHarfi = kelime.substring(kelime.length() - 2);
            System.out.println("kelimeninSonIkiHarfi : " + kelimeninSonIkiHarfi);
        }












    }
}
