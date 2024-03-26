package Test.Day_12;

public class Practice_5 {
    public static void main(String[] args) {
        int dogumYili = 1980;
        int mevcutYil = 2024;
        int yas = yasHesaplama(dogumYili, mevcutYil);
        System.out.println("yas : " + yas );

        String ehliyetdurumu = ehliyetDurumu(yas);
        System.out.println("ehliyetdurumu : " + ehliyetdurumu);
    }

    public static int yasHesaplama(int dogumYili, int mevcutYil){
        int yas = mevcutYil - dogumYili;
        return yas;
    }

    public static String ehliyetDurumu(int yas){
        String mesaj = (yas >= 18)? "Ehliyet alabilir": "Ehliyet alamaz";
        return mesaj;
    }


}
