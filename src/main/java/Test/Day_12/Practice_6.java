package Test.Day_12;

public class Practice_6 {
    public static void main(String[] args) {

        String nickName = nickName("John", 'A');
        System.out.println("nickName : " + nickName);

    }

    public static String nickName(char isim){
        return isim + "nny";
    }

    public static String nickName(String isim){
        return isim + "nny";
    }

    public static String nickName(String isim, char soyisim){
        return isim + "nny";
    }

    public static String nickName(char soyisim, String isim){
        return isim + "nny";
    }

}
