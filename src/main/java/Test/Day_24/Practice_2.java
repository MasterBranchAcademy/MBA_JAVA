package Test.Day_24;

public class Practice_2 {
    public static void main(String[] args) {


        int [] [] notlar = {
                {99,42,74,83,100},
                {90,91,72,88,95},
                {88,61,74,89,96},
                {61,89,82,98,93},
                {93,73,7578,99},
                {50,65,92,87,94}
        };

        int toplam =0;

        for (int i = 0; i < notlar.length; i++) {
           toplam += notlar[i][0];//notlar[3][0] = [satir] [sutun]
        }

        double ortalama = toplam/ notlar.length;
        System.out.println("ortalama : " + ortalama);



    }
}
