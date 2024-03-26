package Test.Day_8;

public class Nested_for_loop {
    public static void main(String[] args) {
/*
        int dummy = 0;

        for (int sayi = 1; sayi <= 50 ; sayi++) {
            dummy = dummy + sayi;
        }

        System.out.println("dummy : " + dummy);

 


        //Nested for loop
        for (int i = 1; i <=5 ; i++) {//  1 2 3 4 5
            System.out.println(".............");

            for (int j = 1; j <=5 ; j++) {// 1 2 3 4 5
                System.out.println("______________");
            }

        }
*/


        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ".(");

            for (int j = 10; j >= 1; j-=2) {
                System.out.print(j + " ");
            }
            System.out.println(")");
        }

        
        
        











    }
}
