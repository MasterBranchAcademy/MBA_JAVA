package Test.Day_24;

public class Practice_4 {
    public static void main(String[] args) {

        String [] [] calisanBilgileri = {
                {"Ad","Soyad", "Maas"},
                {"Cem", "Demir","25.000.00"},
                {"Kaan","Ak","23.200.00"},
                {"Cansu","Hur","18.030.00"},
                {"Yesim","Colak","15.100.00"}
        };

        calisanBilgileri[3][2]= "25500.33";
        calisanBilgileri[4][2]= "36678.90";

        for (int i = 0; i < calisanBilgileri.length; i++) {
            for (int j = 0; j < calisanBilgileri[i].length; j++) {
                System.out.println(calisanBilgileri[i][j]);
            }
        }






    }
}
