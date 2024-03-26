package Test.Day_18;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz:");
        String kelime = scanner.nextLine();

        System.out.println("kelime uzunlugu: " + kelime.length());
        System.out.println("Ilk karakter : " + kelime.charAt(0));
        System.out.println("kelime + concatenation : " + kelime.concat("concatenation"));

        System.out.println("1 den sona : " + kelime.substring(1));
        System.out.println("buyuk harf : " + kelime.toUpperCase());






















    }
}
