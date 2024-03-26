package Test.Day_23.Pack_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] isimListesi = isimList();// {"ahmet", "mehmet","Ayse","John","Ali"}

        for (String isim :isimListesi) {
            System.out.println("isim : " + isim);
        }
    }

    public static String[] isimList(){
        String [] isimListesi = new String[5];// 0 1 2 3 4

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {//1 2 3 4 5
            System.out.println("Lutfen "+ (i + 1) +". ismi giriniz");
            String isim = scanner.nextLine();//
            isimListesi[i] = isim;//isimListesi[0]   isimListesi[1]
        }
        return isimListesi;
    }



}
