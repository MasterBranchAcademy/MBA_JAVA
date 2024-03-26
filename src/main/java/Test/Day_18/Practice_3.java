package Test.Day_18;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz:");
        String cumle = scanner.nextLine();

        System.out.println("cumle : " + cumle);

        int cumleUzunlugu = cumle.length()/2 +1;
        System.out.println("cumle.length() : " + cumle.length());
        System.out.println("cumleUzunlugu : " + cumleUzunlugu);

        String subString = cumle.substring(cumleUzunlugu);
        System.out.println("subString : " + subString);















    }
}
