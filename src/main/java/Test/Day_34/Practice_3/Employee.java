package Test.Day_34.Practice_3;

import java.sql.SQLOutput;

public class Employee {

    String adSoyad;
    int calisilanSaat;

    final int saatlikUcret = 20;

    public Employee(String adSoyad, int calisilanSaat) {
        this.adSoyad = adSoyad;
        this.calisilanSaat = calisilanSaat;
    }

    public double maashesapla(){
        return (calisilanSaat * saatlikUcret);
    }

    public void calisanMaasBilgileri(){
        System.out.println("Ad soyad       : " + adSoyad);
        System.out.println("Calisilan Saat : " + calisilanSaat);
        System.out.println("Maas           :"    + this.maashesapla());
    }



}
