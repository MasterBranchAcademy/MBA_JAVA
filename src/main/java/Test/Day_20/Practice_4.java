package Test.Day_20;

import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <=3 ; i++) {
            System.out.println("Lutfen " +i+ ". Ogrencinin ismini giriniz:");
            String ogrenciIsmi = scanner.nextLine();

            if(ogrenciIsmi.endsWith("met")){
                ogrenciIsmi = ogrenciIsmi.concat("tyyyy");
                System.out.println("ogrenciIsmi : " + ogrenciIsmi);
            }else{
                System.out.println("ogrenciIsmi : " + ogrenciIsmi);
            }
        }




















    }
}
