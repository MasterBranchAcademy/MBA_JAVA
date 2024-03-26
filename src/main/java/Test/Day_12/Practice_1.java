package Test.Day_12;

public class Practice_1 {
    public static void main(String[] args) {
        String isim = "John";
        String nickName = nickNameGenerator(isim);
        System.out.println("nickName :" + nickName);
    }

    public static String nickNameGenerator(String isim){
        String nickName =  isim + "nnny";//Johnnnny
        return nickName;
    }
}
