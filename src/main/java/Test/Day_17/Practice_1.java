package Test.Day_17;

import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz:");
        String metin = scanner.nextLine();

        System.out.println("Lutfen bir terim giriniz:");
        String terim = scanner.nextLine();

        System.out.println(metin + " , " + terim);

        if(metin.isEmpty()) {
            System.out.println("Girilen metin bos");

            if (metin.indexOf(terim) == -1) {
                System.out.println("Terim, metin icerisinde gecmiyor");
            } else {
                System.out.println("Terim, metin icerisinde geciyor");
            }

        }














    }
}
