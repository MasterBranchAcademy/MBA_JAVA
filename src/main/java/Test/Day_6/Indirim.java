package Test.Day_6;

public class Indirim {
    public static void main(String[] args) {

        //kisi bilgileri
        String kisi = "ogrenci";
        int gelir = 1200;

        if(kisi == "ogrenci"){
            System.out.println("Ogrenci olarak sisteme girildi");
            if(gelir <= 1000){
                System.out.println("%50 indirim kazandiniz");
            }else{
                System.out.println("Ogrenci olamaniza ragmen geliriniz cok yuksek");
            }

        } else if (kisi == "memur") {
            System.out.println("memur olarak sisteme girildi");
            if(gelir <= 1000){
                System.out.println("%30 indirim kazandiniz");
            }else{
                System.out.println("memur olamaniza ragmen geliriniz cok yuksek");
            }

        } else if (kisi == "issiz") {
            System.out.println("issiz olarak sisteme girildi");
            if(gelir <= 1000){
                System.out.println("%20 indirim kazandiniz");
            }else{
                System.out.println("issiz olamaniza ragmen geliriniz cok yuksek");
            }

        }else{
            System.out.println("Sizin unvaniniz icin bir indirim bulunamadi");
        }


    }
}
