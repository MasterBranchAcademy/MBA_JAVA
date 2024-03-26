package Test.Day_13;

public class Practice_1 {
    public static void main(String[] args) {

        //Primitive         //Non - primitive
        //byte              //String
        //short             //Class
        //int               //Arrays
        //long
        //float
        //double
        //char
        //boolean

        int number;// Declaration
        int x = 5; // initialize

        String text = "Hello world!";

        //Casting
        //Widening   Narrowing

        int y = 10;
        double z = y;

        float a = 19.5f;
        short b = (short) a;


        //Arithmetic operators

        int t = 150;
        int l = 15;

        int result = t / l;
        //System.out.println("result : " + result);





        //Assignment operators

        int d = 50;
        int k = 20;

        d /= 10;
        //System.out.println("d : " + d);


        //Comparison operators
        // == < > <= >= !=   .....true false

        int p = 50;

        if(p >= 50){

        }


        //Logical operators
        // && || !

        int h = 60;
        int v = 40;

        if(!false){//true
            //System.out.println("heeyyyy");
        }



        //Unary operators

        //increment -post-pre
        //Decrement -post-pre

        int xxx = 12;

        //System.out.println("xxx : " + xxx--);
        //System.out.println("xxx : " + xxx);

        //Control flow statements
        //Selection Statement

        int ID = -925;

        if(ID <= 12345){
            //System.out.println("Kucuk");
        } else if (ID >= 12345) {
            //System.out.println("Buyuk");
        }else{
            //System.out.println("Gecmedi");
        }

        //LOOPING STATEMENT
        // FOR ITERATION
        // FOR EACH

        for (int i = 0; i < 10 ; i++) {
            //System.out.println("Hello");
        }


        //Arrays
        int sayi_1 = 5;
        int sayi_2 = 54;
        int sayi_3 = 45;
        int sayi_4 = 55;

        int [] sayilar = {5,54,45,55};

        for (int sayi : sayilar) {
            //System.out.println(sayi + 10);
        }



        //Branching statement
        // break , continue, return

        int [] numbers = {5,54,45,55};

        for (int num : numbers) {

            if(num == 54){
                continue;
            }
            //System.out.println("num : " + num);
        }



        int m = 10;
        int n = 15;

        if(m == 10){
            //System.out.println("m esittir 10");

            if(n == 15){
                //System.out.println("n esittir 15");
            }


        }else {

            //System.out.println("m esit degildir 10");
        }






        //Ternary operators

        int tt = 120;
        int ff = 100;

        String results = (tt < ff)? "tt" : "ff";//String results = "ff;

        //System.out.println("results : " + results);



        //Switch case

        String gun = "pazartesi";

        switch (gun){

            case "pazartesi":
                int r = 20;
                int i = 57;

                if(r == i){
                    //System.out.println("r == i");
                }else{
                    //System.out.println("!(r == i)");
                }
                //System.out.println("Ilk gun");
                break;

            case "sali":
                //System.out.println("Ikinci gun");
                break;

            default:
                //System.out.println("default");


        }




        //nested for iteration loop

        for (int i = 0; i < 5 ; i++) {
            //System.out.println("i = " + i);
            //System.out.println("///////////////////");

            for (int j = 0; j < 5; j++) {
                //System.out.println("j = " + j);
            }
        }




        //While loop

        int counter =0;

        while (counter <= 100){
            //System.out.println("Heyyyyyyyy");
            counter++;// 0 1 2 3 ..
        }



        boolean statu = false;

        do{
            //System.out.println("heyyy");

            statu = !(statu);//false
        }while (statu);//false

















    }
}
