package Test.Day_6;

public class CalismaSaatleri {
    public static void main(String[] args) {

        String gun = "pazar";
        int saat = 15;

        if(gun == "pazartesi" || gun == "sali" || gun == "carsamba" || gun == "persembe" || gun == "cuma"){
            System.out.println("Hafta ici");

            if(saat >= 9 && saat <= 17){// true && true = true
                System.out.println("Calisama saati");
            }else{
                System.out.println("Calisma saati degil!!!");
            }

        }else if(gun == "cumartesi"){
            System.out.println("cumartesi");

            if(saat >= 10 && saat <= 14){//true && false = false
                System.out.println("Isci cumartesi gunu calisma saatlerinde");
            }else{
                System.out.println("Isci cumartesi gunu calisma saatlerinde degil");
            }

        }else if(gun == "pazar"){
            System.out.println("Isci pazar gunu tatilde");
        }else{
            System.out.println("gecersiz gun, lutfen yeniden deneyiniz");
        }
















    }
}
