package Test.Day_6;

public class Ternary {
    public static void main(String[] args) {

/*
        boolean statu = false;

        String sonuc = (statu)? "xxxx" : "yyyy";
        //String sonuc = "xxxx";
        //String sonuc = "yyyy";

        System.out.println(sonuc);




        //Task

        boolean aramaSonucu = true;

        String sonuc = (aramaSonucu) ?
                                          "QA tester ilani bulundu"
                                        : "QA tester ilani bulunamadi";

        System.out.println("sonuc : " + sonuc);



        //TASK

        char dilSeviyesi = 'C';

        String mesaj = (dilSeviyesi == 'A')? "Mukemmel dil seviyesi":
                       (dilSeviyesi == 'B')? "Iyi dil seviyesi":
                       (dilSeviyesi == 'C')? "Normal dil seviyesi":
                       (dilSeviyesi == 'D')? "Zayif dil seviyesi":
                       (dilSeviyesi == 'F')? "Yetersiz dil seviyesi":
                                              "Bir kurs almalisiniz";

        //String mesaj = "Normal dil seviyesi"

        System.out.println("mesaj : " + mesaj);
*/


        //task
        double maas = 2500;
        double ekGelir = 700;
        int yas = 19;

        String sonuc = ((maas >= 2000 || ekGelir >= 1000) && yas >= 18)?// (true || false) && true   ==== true && true = true
                                                   "Kredi basvurusu onaylandi"
                                                  : "Kredi basvurusu onaylanmadi";


        System.out.println("sonuc : " + sonuc);
















    }
}
