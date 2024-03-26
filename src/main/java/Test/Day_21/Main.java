package Test.Day_21;

public class Main {
    public static void main(String[] args) {

        Utilities utilities = new Utilities();
        int sayi_1= 45;
        int sayi_2= 20;

        int result = utilities.ikiSayininToplami(sayi_1, sayi_2);

        //System.out.println("result: " + result);

        String str = "master";
        char ilkHarf = utilities.ilkHarfAl(str);//M

        //System.out.println("ilkHarf : "+ ilkHarf);

        String str_1 = "master";
        int num = 5;

        String subString = utilities.substringAl(str_1, num);//"maste"

        //System.out.println("subString : " + subString);


        String text = "Merhaba Ahmet";

        char sonKarakter = utilities.sonKarakterAl(text);

        //System.out.println("sonKarakter : " + sonKarakter);



        String str1 = "branch";
        String str2 = "master branch academy";

        String mesaj = utilities.isContains(str1, str2);

        System.out.println("mesaj : " + mesaj);















    }
}
