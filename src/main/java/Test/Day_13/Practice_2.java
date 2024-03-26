package Test.Day_13;

public class Practice_2 {
    public static void main(String[] args) {
        String name = "JOHN";
        String planet = "World";
        int x = 10;
        boolean statu = true;

        String sifre = test(name,planet, x, statu);// String sifre = HelloJOHNWorld10true
        System.out.println("sifre : " + sifre);

        if(sifre == "12345xxx"){
            System.out.println("Sifre dogru");
        }else{
            System.out.println("Sifre yanlis");

        }
    }

    public static String test(String name, String planet, int x, boolean statu){
        String sifre = "Hello" + name  + planet + x  + statu;
        return sifre;
    }



}
