package Test.Day_5;

public class If_statement {
    public static void main(String[] args) {
/*
        int age = 80000;

        if(age<18){//35<18 = false
            System.out.println("Yuzme sporunu yapmalisiniz!!!");
        }else if(age >= 18 && age<=50){// true && false = false
            System.out.println("Kosu sporunu yapmalisiniz!!!");
        }else{
            System.out.println("Yoga sporunu yapmalisiniz!!!");
        }



        //task

        int yas = 70;
        boolean yuzme = true;
        boolean kosu = true;
        boolean yoga = false;

        if(yas < 18 && yuzme == false){//false && false = false
            System.out.println("Yuzme sporunu yapabilirsiniz");
        }else if((yas >= 18 && yas <= 50) && kosu == false){//(true) && false = false
            System.out.println("Kosu sporunu yapabilirsiniz");
        }else if(yas > 50 && yoga == false){//false && false = false
            System.out.println("Yoga sporunu yapabilirsiniz");
        }else{
            System.out.println("Baska bir spor deneyebilirsiniz");
        }


        //TASK

        int johnKazanc = 2500;

        if(johnKazanc > 2000){
            System.out.println("Tebrikler! iyi bir kazanc elde ettiniz");
        }else{
            System.out.println("Tekrar deneyin!!!");
        }
*/


        //Task
        double isci_1 = 2500.75;
        double isci_2 = 3010.09;
        double isci_3 = 2100;
        double bmwFiyat = 15000;

        double toplamKazanc = isci_1 + isci_2 + isci_3;
        System.out.println("toplamKazanc : " + toplamKazanc);

        if(toplamKazanc >= bmwFiyat){
            System.out.println("BMW almak icin yeterli paraniz var!");
        }else{
            System.out.println("BMW almak icin yeterli paraniz yok!");
        }














    }
}
