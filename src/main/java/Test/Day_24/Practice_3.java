package Test.Day_24;

public class Practice_3 {
    public static void main(String[] args) {

        String [] [] ogrenciBilgileri = {
                {"Ogrenci No","Isim", "Soy isim", "Dogum yeri"},
                {"925", "Elif","Yildiz","Antalya"},
                {"369","Murat","Kara","izmir"},
                {"988","Hande","Akdeniz","izmir"},
                {"256","Hasan","Akdeniz","istanbul"},
                {"125","Ferit","Demir","Aydin"},
                {"341","Cemile","Gok","Aydin"},
        };

        for (int i = 0; i < ogrenciBilgileri[0].length; i++) {
            System.out.print(ogrenciBilgileri[0][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < ogrenciBilgileri[3].length; i++) {
            System.out.print(ogrenciBilgileri[3][i]+ " ");//ogrenciBilgileri[satir][sutun]

        }



    }
}
