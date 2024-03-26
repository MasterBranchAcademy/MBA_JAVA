package Test.Day_33.Practice_2;

public class OZ extends MBA{

    public OZ(String sirketIsmi, int ogrenciSayisi, boolean yazDonemKursu) {
        super(sirketIsmi, ogrenciSayisi, yazDonemKursu);
    }

    public void SirketBilgileri(){
        System.out.println("Sirket ismi     : " + sirketIsmi);
        System.out.println("Ogrenci Sayisi  : " + ogrenciSayisi);
        System.out.println("Yaz Donem Kursu : " + yazDonemKursu);
        System.out.println("Hello OZ");
    }
}
