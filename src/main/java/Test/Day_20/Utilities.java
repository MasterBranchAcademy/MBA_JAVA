package Test.Day_20;

public class Utilities {


public String boslukSil(String metin){
    String updatedMetin = metin.trim();
    return updatedMetin;
}

    public String ilkHarfBuyuk(String metin){//"hello Ahmet"
    String ilkKarakter = (metin.charAt(0)+"").toUpperCase() + metin.substring(1);
    return ilkKarakter;
    }


}
