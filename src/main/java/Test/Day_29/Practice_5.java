package Test.Day_29;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> evenNumberList = new ArrayList<>();

        while (true){
            System.out.println("Lutfen bir sayi giriniz: (Cikmak icin 0 giriniz)");
            Integer sayi = scanner.nextInt();

            if(sayi == 0){
                break;
            }
            if(sayi %2 == 0) {
                evenNumberList.add(sayi);
            }
        }

        System.out.println(evenNumberList);




















    }
}
