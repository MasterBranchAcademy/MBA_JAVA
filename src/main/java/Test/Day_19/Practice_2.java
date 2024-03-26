package Test.Day_19;

import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {

        String emailFromDB = "masterbranchacademy@gmail.com";

        Scanner scanner = new Scanner(System.in);
        String emailFromUI="";

        while (!emailFromDB.equalsIgnoreCase(emailFromUI)){
            System.out.println("Lutfen email giriniz:");
            emailFromUI = scanner.nextLine();
        }

















    }
}
