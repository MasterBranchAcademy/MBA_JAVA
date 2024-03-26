package Test.Day_25;

import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz:");
        String girilenMetin = scanner.nextLine();

        if(girilenMetin.isEmpty()){
            System.out.println("Metin Bos!!!");
        }else{
            if(girilenMetin.contains("Hello")){
                String tamMetin = girilenMetin.concat(" world!");
                System.out.println("tamMetin : " + tamMetin);
            }else{
                System.out.println("Girilen metin \"Hello\" kelimesini icermiyor");
            }
        }




    }
}
