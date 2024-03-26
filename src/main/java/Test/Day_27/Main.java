package Test.Day_27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mevcut yili giriniz:");
        Integer mevcutYil = scanner.nextInt();

        System.out.println("Lutfen dogum yili giriniz:");
        Integer dogumYil = scanner.nextInt();

        Practice_7 practice7 = new Practice_7();
        String yas =  practice7.yas(dogumYil,mevcutYil);

        System.out.println("yas : " + yas);













    }
}
