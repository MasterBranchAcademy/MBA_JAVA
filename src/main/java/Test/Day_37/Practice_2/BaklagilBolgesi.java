package Test.Day_37.Practice_2;

public class BaklagilBolgesi extends UrunBolgesi{
    @Override
    public void urunListele() {
        System.out.println("Baklagil Bolgesi urun listesi : nohut, fasulye, ...");
    }

    @Override
    public void stokKontrol() {
        System.out.println("Baklagil Bolgesi stok kontrol: +100");
    }
}
