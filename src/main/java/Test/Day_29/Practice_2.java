package Test.Day_29;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Lutfen bir sayi giriniz:");
            Integer sayi = scanner.nextInt();
            numbers.add(sayi);
        }

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(numbers.get(i) + ", ");
        }




    }
}
