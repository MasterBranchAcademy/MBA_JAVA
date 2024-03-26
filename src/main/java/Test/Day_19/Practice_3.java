package Test.Day_19;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz:");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen aranacak kelime giriniz:");
        String kelime = scanner.nextLine();

        if(cumle.contains(kelime)){
            System.out.println(cumle + " ," + kelime + "'i " + "iceriyor" );
        }else{
            System.out.println(cumle + " ," + kelime + "'i " + "icermiyor" );
        }














    }
}
