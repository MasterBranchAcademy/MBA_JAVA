package Test.Day_17;

import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz:");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz:");
        String soyisim = scanner.nextLine();

        String fullName = isim.concat(" ").concat(soyisim);
        System.out.println("fullName : " + fullName);

        int isimUzunlugu = fullName.length();

        System.out.println("isimUzunlugu : " + isimUzunlugu);















    }
}
