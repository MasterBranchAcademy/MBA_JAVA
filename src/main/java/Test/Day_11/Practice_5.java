package Test.Day_11;

public class Practice_5 {
    public static void main(String[] args) {

        //Ahmet
        int dogumYili = 2000;
        String ilKodu = "ISt";
        String KN = "2445";
        pasaportNumarasiOlustur(dogumYili, ilKodu, KN);

        //Mehmet
        int dogumYili_M = 2000;
        String ilKodu_M = "ISt";
        String KN_M = "2445";
        pasaportNumarasiOlustur(dogumYili_M, ilKodu_M, KN_M);
    }

   public static void pasaportNumarasiOlustur(int dogumYili, String ilKodu, String KN){
        String pasaportNumarasi = dogumYili + ilKodu + KN;
        System.out.println("pasaportNumarasi : " + pasaportNumarasi);
   }

}
