package Test.Day_20;

import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz:");
        String metin = scanner.nextLine();

        Utilities utilities = new Utilities();
        String updatedMetin = utilities.boslukSil(metin);

        System.out.println("updatedMetin :" + updatedMetin);

        String ilkHarfiBuyukString = utilities.ilkHarfBuyuk(updatedMetin);//hello Ahmet   return Hello Ahmet

        System.out.println("ilkHarfiBuyukString : " + ilkHarfiBuyukString);


















    }
}
