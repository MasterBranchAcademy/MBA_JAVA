package Test.Day_19;

import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {

        String mbaPassword = "gizliMBApassword";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz:");
        String cumle = scanner.nextLine();

        String result = (cumle.contains(mbaPassword))? "Giris onylandi": "sahte password!!!";

        System.out.println("result : " + result);















    }
}
