package Test.Day_21;

public class Utilities {

    public int ikiSayininToplami(int sayi_1, int sayi_2){
        return sayi_1 + sayi_2;
    }

    public char ilkHarfAl(String str){
        char ilkKarakter=' ';

        if(str.length() == 0) {
            System.out.println("String bos!!!");
        }else{
            ilkKarakter =  str.charAt(0);//M
        }
        return ilkKarakter;
    }

    public String substringAl(String str, int num){//"master"
         return str.substring(0,num);//"maste"
    }

    public char sonKarakterAl(String str){
        return str.charAt(str.length() - 1);
    }

    public String isContains(String str1, String str2){
        String mesaj="";

        if(str2.contains(str1)){
            mesaj = "iceriyor";
        }else{
            mesaj = "icermiyor";
        }
        return mesaj;
    }
}
