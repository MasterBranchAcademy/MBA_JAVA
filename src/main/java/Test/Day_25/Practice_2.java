package Test.Day_25;

import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz:");
        String girilenKelime = scanner.nextLine();

        for (int index = 0; index <girilenKelime.length() ; index++) {
            char karakter = girilenKelime.charAt(index);
            String yeniKelime = karakter + "ahna";
            System.out.println("yeniKelime : " + yeniKelime);
        }




    }
}
