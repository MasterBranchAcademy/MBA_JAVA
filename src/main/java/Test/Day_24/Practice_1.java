package Test.Day_24;

public class Practice_1 {
    public static void main(String[] args) {

        //Multi-Dimensional Array

        int [] sayilar_1 = {36,9,87};//   0 1 2
        int [] sayilar_2 = {26, 54, 5};// 0 1 2
        int [] sayilar_3 = {3, 11, 62};// 0 1 2

        int [] [] sayilar = {
                {36,9,87},    //00 01 02   sayilar[0]
                {26, 54, 5, 777777},  //10 11 12   sayilar[1]
                {3, 11, 62},  //20 21 22   sayilar[2]
                {5, 6, 7}   // 5 6 7       sayilar[3]
        };

        for (int i = 0; i < sayilar.length; i++) {//0  1 sayilar.length = 4

            for (int j = 0; j < sayilar[i].length; j++) {//0 1 2  sayilar[1].length

                System.out.println(sayilar[i][j]);//0
            }
        }





    }
}
