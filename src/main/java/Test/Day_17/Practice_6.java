package Test.Day_17;

import java.util.Scanner;

public class Practice_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz:");
        String isim = scanner.nextLine();

        System.out.println("Lutfen okul numaranizi giriniz:");
        int okulNumarasi = scanner.nextInt();

        System.out.println("Lutfen mevcut yili giriniz:");
        int mevcutYil = scanner.nextInt();

        String sifre = isim + okulNumarasi + mevcutYil;

        int sifreUzunlugu = sifre.length();
        if(sifreUzunlugu < 8){
            System.out.println("Sifre guvensiz");
        }else if(sifreUzunlugu >= 8 && sifreUzunlugu<=15){
            System.out.println("Orta guclu sifre");
        }else if(sifreUzunlugu > 15 && sifreUzunlugu<=25){
            System.out.println("Iyi guclu sifre");
        }else if(sifreUzunlugu>=25){
            System.out.println("Cok guclu sifre");
        }else{
            System.out.println("Gecersiz sifre");
        }


















    }
}
