package Test.Day_33.Practice_2;

public class MBA {
    String sirketIsmi;
    int ogrenciSayisi;
    boolean yazDonemKursu;

    public MBA(String sirketIsmi, int ogrenciSayisi, boolean yazDonemKursu) {
        this.sirketIsmi = sirketIsmi;
        this.ogrenciSayisi = ogrenciSayisi;
        this.yazDonemKursu = yazDonemKursu;
    }

    public void SirketBilgileri(){
        System.out.println("Sirket ismi     : " + sirketIsmi);
        System.out.println("Ogrenci Sayisi  : " + ogrenciSayisi);
        System.out.println("Yaz Donem Kursu : " + yazDonemKursu);
        System.out.println("Hello MBA");
    }
}
