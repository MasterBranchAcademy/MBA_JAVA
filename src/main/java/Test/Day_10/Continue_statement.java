package Test.Day_10;

public class Continue_statement {
    public static void main(String[] args) {

        /*
        for (int i = 1; i <= 5; i++) {//1 2 3 4 5
            if(i == 3){// 5 == 3
               continue;
            }
            System.out.println(i);// 1 2 4 5
        }





        //TASK

        for (int i = 1; i <=20 ; i++) {// 1 2 3 4 5 6

            if(i%4 == 0){//
                continue;
            }

            if(i%2 == 0){
                System.out.println(i);//2 6
            }
        }



        //task

        int toplam = 0;

        for (int i = 1; i <= 30 ; i++) {
            toplam = toplam + i;
            System.out.println("toplam " + toplam);

            if(toplam == 15){
               break;
            }
        }
        System.out.println(toplam);

*/


        //TASK
        int counter = 0;

        for (int i = 100; i > 0 ; i--) {

            if(i <= 75){
                break;
            }else if(i < 90){
                counter++;
                System.out.println("Bu sayi dahil edilmedi!");
            }else if(i%2 == 0){
                System.out.println(i);
            }
        }

        System.out.println("counter : " + counter);












    }
}
