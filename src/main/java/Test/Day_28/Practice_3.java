package Test.Day_28;

import java.util.ArrayList;
import java.util.Random;

public class Practice_3 {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> randomList = new ArrayList<>();

        for (int i = 1; i <=10 ; i++) {
            int sayi = random.nextInt(100)+1;
            randomList.add(sayi);
        }

        System.out.println(randomList);
















    }
}
