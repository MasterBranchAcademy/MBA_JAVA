package Test.Day_22;

import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {

        int [] sayilar = {10,20, 30, 40, 50 ,60, 70, 80, 90, 100};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi tahmin ediniz:");
        int kullanicidanGelenSayi = scanner.nextInt();//15

        for (int sayi: sayilar) {
            if(kullanicidanGelenSayi == sayi){
                System.out.println("Esittir");
                break;
            }else{
                System.out.println("Array icinde gecmiyor");
            }
        }















    }
}
