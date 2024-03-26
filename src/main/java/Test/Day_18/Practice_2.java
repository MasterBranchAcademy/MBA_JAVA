package Test.Day_18;

import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz:");
        String kelime = scanner.nextLine();

        System.out.println("kelime : " + kelime);
        int ortadakiIndex = kelime.length()/2;
        char ortadakiKarakter = kelime.charAt(ortadakiIndex);

        System.out.println("ortadakiKarakter : " + ortadakiKarakter);












    }
}
