package Test.Day_7;

public class SwitchCase_Practice {
    public static void main(String[] args) {

/*
        String statu = "test_10";

        switch (statu){
            case "test_1":
                System.out.println("test_1 degeri geldi");
                break;
            case "test_2":
                System.out.println("test_2 degeri geldi");
                break;
            case "test_3":
                System.out.println("test_3 degeri geldi");
                break;
            default:
                System.out.println("Sonuc bulunamadi");
        }



        // Task

        int level = 2;

        switch (level){
            case 1:
                System.out.println("Level 1 oynuyorsunuz");
                break;
            case 2:
                System.out.println("Level 2 oynuyorsunuz");
                break;
            case 3:
                System.out.println("Level 3 oynuyorsunuz");
                break;
            default:
                System.out.println("Gecersiz level");
        }





        //Task
        int takipciSayisi = 1000000;

        switch (takipciSayisi){
            case 1000:
                System.out.println("Iyi bir baslangic");
                break;
            case 2000:
                System.out.println("Guzel gidiyor");
                break;
            case 3000:
                System.out.println("Isler harika");
                break;
            case 10000:
                System.out.println("waaaawwwwww");
                break;
            case 100000:
                System.out.println("En buyuk esigi astin!!!!");
                break;
            case 1000000:
                System.out.println("Artik sen bir fenenomensin!!!!!!");
                break;
            default:
                System.out.println("Gecersiz takipci sayisi");
        }
 */




        //Task
        String gun = "monday";

        switch (gun){

            case "pazartesi":
                int pazartesiMesaiUcreti = 10;
                int pazartesiCalisilanSaat = 10;
                int pazartesiToplamUcret = pazartesiMesaiUcreti * pazartesiCalisilanSaat;
                System.out.println("pazartesiToplamUcret : " + pazartesiToplamUcret);
                break;

            case "sali":
                int saliMesaiUcreti = 15;
                int saliCalisilanSaat = 10;
                int saliToplamUcret = saliMesaiUcreti * saliCalisilanSaat;
                System.out.println("saliToplamUcret : " + saliToplamUcret);
                break;
            case "carsamba":
                int carsambaMesaiUcreti = 20;
                int carsambaCalisilanSaat = 10;
                int carsambaToplamUcret = carsambaMesaiUcreti * carsambaCalisilanSaat;
                System.out.println("carsambaToplamUcret : " + carsambaToplamUcret);
                break;
            case "persembe":
                int persembeMesaiUcreti = 30;
                int persembeCalisilanSaat = 10;
                int persembeToplamUcret = persembeMesaiUcreti * persembeCalisilanSaat;
                System.out.println("persembeToplamUcret : " + persembeToplamUcret);
                break;
            case "cuma":
                int cumaMesaiUcreti = 40;
                int cumaCalisilanSaat = 10;
                int cumaToplamUcret = cumaMesaiUcreti * cumaCalisilanSaat;
                System.out.println("cumaToplamUcret : " + cumaToplamUcret);
                break;
            case "cumartesi":
                int cumartesiMesaiUcreti = 50;
                int cumartesiCalisilanSaat = 10;
                int cumartesiToplamUcret = cumartesiMesaiUcreti * cumartesiCalisilanSaat;
                System.out.println("cumartesiToplamUcret : " + cumartesiToplamUcret);
                break;
            case "pazar":
                int pazarMesaiUcreti = 60;
                int pazarCalisilanSaat = 10;
                int pazarToplamUcret = pazarMesaiUcreti * pazarCalisilanSaat;
                System.out.println("pazarToplamUcret : " + pazarToplamUcret);
                break;
            default:
                System.out.println("Gecersiz gun!!!");
        }

















    }
}
