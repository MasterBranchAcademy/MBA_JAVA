package Test.Day_17;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        String passwordFromDB = "123abcABC!";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen password giriniz:");
        String passwordFromUI = scanner.nextLine();//USER INTERFACE

        String passwordFromDB_1 = passwordFromDB.toLowerCase();
        String passwordFromUI_1 = passwordFromUI.toLowerCase();

        if(passwordFromDB_1.equals(passwordFromUI_1)){
            System.out.println("Giris basarili!");
        }else{
            System.out.println("Yanlis password");
        }















    }
}
