package Test.Day_37.Practice_2;

public class SutUrunleriBolgesi extends UrunBolgesi{
    @Override
    public void urunListele() {
        System.out.println("sut Urunleri Bolgesi urun listesi : sut, yogurt, ...");
    }

    @Override
    public void stokKontrol() {
        System.out.println("sut Urunleri Bolgesi stok kontrol : +200");
    }
}
