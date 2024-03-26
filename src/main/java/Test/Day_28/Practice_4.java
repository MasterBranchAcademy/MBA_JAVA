package Test.Day_28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz:");
        String cumle = scanner.nextLine();

        String [] kelimeler = cumle.split(" ");
        System.out.println(Arrays.toString(kelimeler));//Array

        ArrayList<String> kelimeListesi = new ArrayList<>();
        Collections.addAll(kelimeListesi,kelimeler);

        Collections.reverse(kelimeListesi);
        System.out.println(kelimeListesi);

        for (int i = 0; i < kelimeListesi.size(); i++) {
            System.out.print(kelimeListesi.get(i) + " ");
        }
















    }
}
