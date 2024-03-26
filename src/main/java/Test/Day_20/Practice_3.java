package Test.Day_20;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {


        String paragraf = "Keloglan sabah uyandi, kahvaltisini yapti. Daha sonra Keloglan annesinin yanina gitti. Keloglan annesine pazara gidecegini soyledi.";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kahraman ismi giriniz:");
        String kahramanIsmi = scanner.nextLine().toUpperCase();

        String updatedParagraf = paragraf.replace("Keloglan", kahramanIsmi);

        System.out.println("updatedParagraf: " + updatedParagraf);


















    }
}
