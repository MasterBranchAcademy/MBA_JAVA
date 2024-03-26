package Test.Day_19;

import java.util.Scanner;

public class Practice_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kelime giriniz:");
        String kelime = scanner.nextLine();

        if(kelime.equals("OpenAI.") && kelime.length()==7){
            System.out.println("Tebrikler dogru kelimeyi girdiniz");
        }else{
            System.out.println("Uzgunum yanlis kelime veya uzunluk");
        }




















    }
}
