package Test.Day_25;

import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        String isim = "OZ";

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz:");
        String girilenCumle = scanner.nextLine().toLowerCase();

        String lowerIsim = isim.toLowerCase();

        if(girilenCumle.contains(lowerIsim)){
            System.out.println("isim, cumlede geciyor");
            String yeniCumle = girilenCumle.replaceAll(lowerIsim,"hacked");
            System.out.println("yeniCumle : " + yeniCumle);
        }else{
            System.out.println("isim, cumlede gecmiyor");
        }





    }
}
