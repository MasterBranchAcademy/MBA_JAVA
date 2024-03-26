package Test.Day_26;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {

        temelOgrenciBilgisi();
    }

    public static void temelOgrenciBilgisi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ad, soyad, ulke ve brans giriniz:");
        String ogrenciBilgisi = scanner.nextLine();

        String [] liste = ogrenciBilgisi.split(",");

        System.out.println("Ad      :" + liste[0]);
        System.out.println("Soyad   :" + liste[1]);
        System.out.println("Ulke    :" + liste[2]);
        System.out.println("Brans   :" + liste[3]);
    }
}
