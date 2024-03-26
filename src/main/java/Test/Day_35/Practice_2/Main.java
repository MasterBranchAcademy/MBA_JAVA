package Test.Day_35.Practice_2;

public class Main {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;
        int num3 = 15;

        System.out.println(toplama(5,10));
        System.out.println(toplama(5,10,15));
    }

    public static int toplama(int num1, int num2){
            return num1 + num2;
    }

    public static int toplama(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

}
