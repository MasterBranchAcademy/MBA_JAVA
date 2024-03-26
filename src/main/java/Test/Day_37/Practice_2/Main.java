package Test.Day_37.Practice_2;

public class Main {
    public static void main(String[] args) {

        BaklagilBolgesi baklagilBolgesi = new BaklagilBolgesi();
        SutUrunleriBolgesi sutUrunleriBolgesi = new SutUrunleriBolgesi();

        baklagilBolgesi.urunListele();
        baklagilBolgesi.stokKontrol();

        System.out.println("................");

        sutUrunleriBolgesi.urunListele();
        sutUrunleriBolgesi.stokKontrol();


    }
}
