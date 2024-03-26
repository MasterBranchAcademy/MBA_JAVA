package Test.Day_28;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> isimListesi = new ArrayList<>();

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Lutfen bir isim giriniz:");
            String isim = scanner.nextLine();// String isim = John
            isimListesi.add(isim);
        }

        System.out.println(isimListesi);











    }
}
