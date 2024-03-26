package Test.Day_23.Pack_2;

public class Main {
    public static void main(String[] args) {

        String [] isimListesi = {"Ahmet", "Mehmet", "Ayse"};//5 + 6 + 4  = 15

       int toplam =  toplamListeUzunlugu(isimListesi);
        System.out.println("toplam : " + toplam);
    }

    public static int toplamListeUzunlugu(String [] isimListesi){

        int index = 0;
        int toplam = 0;
        for (String isim: isimListesi) {
            int uzunluk = isimListesi[index].length();//5
            toplam = toplam + uzunluk;
            index++;
        }
        return toplam;
    }



}
