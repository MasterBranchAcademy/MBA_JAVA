package Test.Day_16;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        int sayi = scanner.nextInt();

        int sayininKaresi = sayi * sayi;

        System.out.println("sayininKaresi : " + sayininKaresi);






        //Task

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz:");
        double kenarUzunlugu = scanner.nextDouble();

        //alan
        double alan = kenarUzunlugu * kenarUzunlugu;
        System.out.println("alan : " + alan);

        //cevre
        double cevre = kenarUzunlugu * 4;
        System.out.println("cevre : " + cevre);







        //Task

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen yasinizi girebilir misiniz?");
        int yas = scanner.nextInt();

        String mesaj = (yas >= 18)? "Ehliyet alabilirsinz" : "ehliyet alamazsiniz";
        System.out.println("mesaj : " + mesaj);




        //Task

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ehliyet turunu giriniz:");
        char ehliyetTuru = scanner.nextLine().charAt(0);//'A'

        switch (ehliyetTuru){

            case 'A':
                System.out.println("Motosiklet");
                break;
            case 'B':
                System.out.println("Otomobil ve minibus");
                break;
            case 'C':
                System.out.println("Kamyon ve otobus");
                break;
            default:
                System.out.println("Gecersiz ehliyet turu");
        }





        //Task

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        double girilenSayi = scanner.nextDouble();

        double sayininKarakoku = Math.sqrt(girilenSayi);
        System.out.println("sayininKarakoku : " + sayininKarakoku);

        double sayininYuvarlanmasi = Math.round(sayininKarakoku);
        System.out.println("sayininYuvarlanmasi: " + sayininYuvarlanmasi);




        //Task
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        double girilenSayi = scanner.nextDouble();

        double asagiYuvarlananSayi = Math.floor(girilenSayi);
        System.out.println("asagiYuvarlananSayi : " + asagiYuvarlananSayi);

        double yukariYuvarlananSayi = Math.ceil(girilenSayi);
        System.out.println("yukariYuvarlananSayi : " + yukariYuvarlananSayi);

*/



        //Task
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        Random random = new Random();

        int rastgeleSayi = random.nextInt(girilenSayi) +1;

        System.out.println("rastgeleSayi : " + rastgeleSayi);















    }
}
