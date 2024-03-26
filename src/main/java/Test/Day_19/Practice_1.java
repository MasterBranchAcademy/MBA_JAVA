package Test.Day_19;

import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 1.kelimeyi giriniz:");
        String kelime_1 = scanner.nextLine();

        System.out.println("Lutfen 2.kelimeyi giriniz:");
        String kelime_2 = scanner.nextLine();

        boolean esitMi = kelime_1.equals(kelime_2);

        String mesaj = (esitMi)? "kelimeler esit": "Kelimeler esit degil";

        System.out.println("mesaj : " + mesaj);
















    }
}
