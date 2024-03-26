package Test.Day_12;

public class Return_practice {
    public static void main(String[] args) {

        String isim_1 = "OZ";
        String isim_2 = "Mehmet";
        String selam  = greeting(isim_1);// Hello Mehmet!

        System.out.println("selam : " + selam);
    }

    public static String greeting(String isim_1){
        String selamlama = "Hello " + isim_1 + "!";// Hello Mehmet!
        return selamlama;
    }

}
