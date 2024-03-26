package Test.Day_15.Pratik_6;

public class Main {
    public static void main(String[] args) {

        Kitap kitap_1 = new Kitap();

        kitap_1.yazar = "Tolstoy";
        kitap_1.baslik = "Hatiralarim";
        kitap_1.yayinYili = 1987;
        kitap_1.bilgileriYazdir();

        System.out.println("/////////////");

        Kitap kitap_2 = new Kitap();

        kitap_2.yazar = "Ataturk";
        kitap_2.baslik = "Karlsbad Hatiralarim";
        kitap_2.yayinYili = 2014;
        kitap_2.bilgileriYazdir();

    }
}
