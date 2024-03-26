package Test.Day_19;

import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 4 temel OOP prensibini giriniz:");
        String cumle = scanner.nextLine();

        String prensip_1 = "inheritance";
        String prensip_2 = "polymorphism";
        String prensip_3 = "encapsulation";
        String prensip_4 = "abstraction";

        if(cumle.contains(prensip_1) && cumle.contains(prensip_2) && cumle.contains(prensip_3) && cumle.contains(prensip_4)){
            System.out.println("Evet, bir seyler biliyorsunuz");
        }else{
            System.out.println("siz OOP bilmiyorsunuz");
        }




















    }
}
