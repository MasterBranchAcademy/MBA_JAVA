package Test.Day_35.Practice_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isim giriniz:");
        String firstName = scanner.nextLine();

        System.out.println("Lutfen ikinci isim giriniz:");
        String middleName = scanner.nextLine();

        System.out.println("Lutfen soyIsim giriniz:");
        String lastName = scanner.nextLine();

        System.out.println("Lutfen yas giriniz:");
        int age = scanner.nextInt();

        String id ="";
        if(middleName.isEmpty()){
             id = passportID(age,firstName,lastName);
            System.out.println("id: " + id);
        }else{
            id =  passportID(age,firstName,lastName, middleName);
            System.out.println("id: " + id);
        }
    }

    public static String passportID(int age, String firstName, String lastName){
        return  age + firstName + lastName;
    }

    public static String passportID(int age, String firstName, String lastName, String middleName){
        return  age + firstName + middleName + lastName;
    }
}
