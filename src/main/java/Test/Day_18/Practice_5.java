package Test.Day_18;

import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz:");
        String kelime = scanner.nextLine();

        System.out.println("kelime : " + kelime);
        System.out.println("kelime.length() : " + kelime.length());
        int length = kelime.length();//6

        int counter = 0;
        String sonKarakter = "nnny";

        while (length > 0 ){// 0 > 0 = FALSE
            char karakter = kelime.charAt(counter);// 0 1 2 3 4 5
            System.out.println("karakter : " + karakter + sonKarakter);
            length--;// 6 5 4 3 2 1 0
            counter++;
        }






        //MASTER
        //RETSAM






    }
}
