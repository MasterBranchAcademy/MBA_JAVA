package Test.Day_29;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        Integer toplam =0;
        while (true){
            System.out.println("Lutfen bir sayi giriniz:(cikmak icin '0' giriniz)");
            Integer sayi = scanner.nextInt();

            if(sayi == 0){
                break;
            }
            numbers.add(sayi);
            toplam += sayi;
        }
        System.out.println("toplam: " + toplam);














    }
}
