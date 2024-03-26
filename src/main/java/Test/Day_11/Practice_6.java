package Test.Day_11;

public class Practice_6 {
    public static void main(String[] args) {

        String ad = "Ahmet";
        String soyad = "Yilmaz";
        int DT = 1986;
        char ehliyet = 'C';
        boolean durum = true;

        ogrenciBilgileri(ad, soyad,DT,ehliyet,durum);


        String ad_1 = "Mehmet";
        String soyad_1 = "Can";
        int DT_1 = 1990;
        char ehliyet_1 = 'A';
        boolean durum_1 = false;

        ogrenciBilgileri(ad_1, soyad_1,DT_1,ehliyet_1,durum_1);
    }

    public static void ogrenciBilgileri(String ad, String soyad, int DT, char ehliyet, boolean durum){
        System.out.println("Ad: "+ ad + "\n" + "Soyad: " + soyad + "\n" + "Dogum tarihi: " + DT + "\n" + "Ehliyet: " + ehliyet + "\n" + "Durum: " + durum) ;
    }
}
