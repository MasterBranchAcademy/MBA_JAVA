package Test.Day_20;

import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz:");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz:");
        String soyismin = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz:");
        String yas = scanner.nextLine();

        System.out.println("Lutfen cinsiyetinizi giriniz:");
        String cinsiyet = scanner.nextLine();

        String info = isim.concat(", ").concat(soyismin).concat(", ").concat(yas).concat(", ").concat(cinsiyet);
        System.out.println("info: " + info);

        System.out.println("Lutfen yeni bir soyisim giriniz:");
        String yeniSoyisim = scanner.nextLine();

        soyismin = yeniSoyisim;

        String info_1 = isim.concat(", ").concat(soyismin).concat(", ").concat(yas).concat(", ").concat(cinsiyet);
        System.out.println("info_1: " + info_1);














    }
}
