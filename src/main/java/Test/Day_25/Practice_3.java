package Test.Day_25;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz:");
        String girilenKelime = scanner.nextLine();

        boolean kucukHarf = false;
        for (int index = 0; index <girilenKelime.length() ; index++) {
            char karakter = girilenKelime.charAt(index);

            if(Character.isLowerCase(karakter)){
                kucukHarf = true;
                break;
            }
        }

        if(kucukHarf){
            System.out.println("Kelimenin icinde kucuk harf buluyor");
        }else{
            System.out.println("Kelime buyuk harflerden olusuyor");
        }



    }
}
