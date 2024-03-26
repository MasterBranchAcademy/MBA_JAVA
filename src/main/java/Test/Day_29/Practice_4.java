package Test.Day_29;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> isimler = new ArrayList<>();

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Lutfen "+ i +". arkadasinizin ismini giriniz");
            String isim = scanner.nextLine();
            isimler.add(isim);
        }

        String yeniIsim ="";
        for (String isim:isimler) {//John
            yeniIsim += isim.charAt(0);
        }

        System.out.println("yeniIsim: " + yeniIsim);













    }
}
