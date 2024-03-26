package Test.Day_17;

import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir erkek ismi giriniz:");
        String erkekIsmi = scanner.nextLine();

        System.out.println("Lutfen bir kiz ismi giriniz:");
        String kizIsmi = scanner.nextLine();

        System.out.println(erkekIsmi + " , " + kizIsmi);

        int isimUzunlukFarki = Math.abs( erkekIsmi.length() - kizIsmi.length());
        System.out.println("isimUzunlukFarki: " + isimUzunlukFarki);

        if(isimUzunlukFarki <= 3){
            System.out.println("Iyi bir eslesme");
        }else {
            System.out.println("Uyumsuz isimler");
        }















    }
}
