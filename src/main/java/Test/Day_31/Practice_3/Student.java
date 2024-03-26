package Test.Day_31.Practice_3;

public class Student {

    String isim;
    String soyIsim;
    int yas;
    double gelir;
    double gider;
    int dogumYili;
    char ehliyet;
    String bolum;
    String ID;
    double vizeSonucu;
    double finalSonucu;
    double butSonucu;

    //constructors
    public Student(String isim, String soyIsim, int yas, double gelir, double gider, int dogumYili, char ehliyet, String bolum, String ID, double vizeSonucu, double finalSonucu) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
        this.gelir = gelir;
        this.gider = gider;
        this.dogumYili = dogumYili;
        this.ehliyet = ehliyet;
        this.bolum = bolum;
        this.ID = ID;
        this.vizeSonucu = vizeSonucu;
        this.finalSonucu = finalSonucu;
    }

    public double maddiDurum(){
        double maddiDurum = gelir - gider;
        return maddiDurum;
    }

    public String dersDurumu(){
        double toplam = (vizeSonucu + finalSonucu)/2;
        String sonucMesaji = "";
        if(toplam >= 50){
            sonucMesaji =  "Tebrikler dersi gectiniz!!!";
        }else{
            sonucMesaji = "Malesef, dersi tekrar etmeniz gerekiyor";
        }
        return sonucMesaji;
    }

}
