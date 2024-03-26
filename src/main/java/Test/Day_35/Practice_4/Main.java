package Test.Day_35.Practice_4;

public class Main {
    public static void main(String[] args) {

        int length = 10;
        int width = 20;
        int radius = 30;

        //Dikdortgeb alani
        int alanDikdortgen = calculateArea(length,width);
        System.out.println("alanDikdortgen : " + alanDikdortgen);

        double alanDaire = calculateArea(30);
        System.out.println("alanDaire : " + alanDaire);
    }

    public static int calculateArea(int length, int width){
       return (length * width);
    }

    public static double calculateArea(int radius){
       return (Math.PI * radius * radius);
    }
}
