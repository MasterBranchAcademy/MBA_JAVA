package Test.Day_27;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz:");
        Integer yas = scanner.nextInt();

        String mesaj = (yas >= 18)?"18 yasindan buyuksunuz, ehliyet alabilirsiniz"
                                  :"Ehliyet almak icin henuz yasiniz uygun degil";

        System.out.println("mesaj : " + mesaj);















    }
}
