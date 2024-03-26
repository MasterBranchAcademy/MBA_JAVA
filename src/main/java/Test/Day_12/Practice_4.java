package Test.Day_12;

public class Practice_4 {
    public static void main(String[] args) {

        double yuzde = -70;

        String mesaj = mesajVer(yuzde);
        System.out.println("mesaj : " + mesaj);
    }

    public static String mesajVer(double yuzde){

        String mesaj;

        if(yuzde == 0){
            mesaj = "henuz hic otomasyonlastirma yapilmadi";
        } else if (yuzde > 0 && yuzde < 50) {
            mesaj = "otomasyonlastirilan testlerin yuzdesi dusuk";
        } else if (yuzde >= 50) {
            mesaj = "Testlerin buyuk bir kismi otomasyonlastirildi";
        }else{
            mesaj = "Hatali yuzde";
        }
      return mesaj;
    }
}
