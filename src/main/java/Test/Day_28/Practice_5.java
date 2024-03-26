package Test.Day_28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> isimler = new ArrayList<>();

        while (true){
            System.out.println("Lutfen gruptaki isimleri giriniz, cikmak icin 'q' ya basiniz:");
            String isim = scanner.nextLine();
            if(isim.equalsIgnoreCase("q")){
                break;
            }
            isimler.add(isim);
        }
        System.out.println(isimler);

        Collections.sort(isimler);
        System.out.println(isimler);













    }
}
