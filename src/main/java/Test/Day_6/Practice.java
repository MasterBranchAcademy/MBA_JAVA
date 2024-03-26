package Test.Day_6;

public class Practice {
    public static void main(String[] args) {

        String kullaniciIsmi = "John Smith";
        String sifre = "John1955.";

        if(kullaniciIsmi == "John Smith"){
            System.out.println("Kullanici ismi dogru!");

            if(sifre == "John1955"){
                System.out.println("Sifre dogru!!!");
                System.out.println("Sisteme girildi!!!");
            }else{
                System.out.println("Sifre yanlis!!");
                System.out.println("Sisteme girilemedi!!!");
            }
        }else{
            System.out.println("Kullanici ismi hatali");
        }





    }
}
