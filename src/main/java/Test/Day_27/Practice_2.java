package Test.Day_27;

import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen alisveris tutarini giriniz:");
        Double alisverisTutari = scanner.nextDouble();

        System.out.println("Lutfen odenen tutari giriniz:");
        Double odenenTutar = scanner.nextDouble();

        Double fark = odenenTutar - alisverisTutari;

        if(fark < 0 ){
            System.out.println("Daha fazla odemeniz gerekiyor: " + fark);
        }else if(fark == 0){
            System.out.println("Tesekkurler, iyi gunler");
        }else{
            System.out.println("Lutfen para ustunu aliniz: " + fark);
        }











    }
}
