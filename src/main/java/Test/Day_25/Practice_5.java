package Test.Day_25;

import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {
        String sistemdekiParola = "OZ2024Master";

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir parolayi giriniz:");
        String girilenParola = scanner.nextLine().toLowerCase();

        String updatedParola = girilenParola.trim();

        if(sistemdekiParola.equalsIgnoreCase(updatedParola)){
            System.out.println("Parola dogru!!!");
        }else{
            System.out.println("Parola yanlis!!!");
        }




    }
}
