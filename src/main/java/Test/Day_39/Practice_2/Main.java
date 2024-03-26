package Test.Day_39.Practice_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> idList = new HashSet<>();

        for (int i = 0; i <3 ; i++) {
            System.out.println("Lutfen ID numaranizi giriniz:");
            Integer ID = scanner.nextInt();
            idList.add(ID);
        }

        System.out.println(idList);

    }
}
