package Test.Day_10;

public class Break_statement {
    public static void main(String[] args) {

        //break;
        /*
        int id = 255;

        for (int i = 1; i <= 1000000 ; i++) {

            System.out.println(i + ". ID");

            if(i == 255){
                System.out.println("ID " + id + " bulundu!");
                break;
            }

            System.out.println("heeeyyyyyyy");
        }





        int number = 5;

        while (number >= 1){// 3 >= 1

            if(number %3 == 0){// true
                System.out.println(number + " : 3 un kati");
                break;
            }
            System.out.println(number);
            number--;// 3
        }



        //Task

        int counter = 0;

        for (int i = 1; i <= 10000 ; i+=2) {//1 .... 52
            counter++;//53

            if(counter == 53){//53 == 53
                System.out.println(i + " bulundu!!!");
              break;
            }

        }

 */

        String mevsim = "yaz";

        switch (mevsim){
            case "ilkbahar":
                System.out.println("Gelmis bahar, acmis cicekler\nRenk renk doga sevincle doldu gokler");
                break;
            case "yaz":
                System.out.println("Sicacik gunes yukseldi tepelere\nDenizde serinlik ferah bir esintiyle");
                break;
            case "sonbahar":
                System.out.println("Dusen yapraklar kizillikla suslendi\nRuzgar eserken doganin sirri cozuldu");
                break;
            case "kis":
                System.out.println("Beyaz ortu dusmus tum yollara\nSicacik caylarla isiniyor her evin odasi");
            default:
                System.out.println("Gecersiz mevsim ismi");
        }

















    }
}
