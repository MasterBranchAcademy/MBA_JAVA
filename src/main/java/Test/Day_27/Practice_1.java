package Test.Day_27;

public class Practice_1 {
    public static void main(String[] args) {

        //autoboxing

        int sayi = 10;

        Integer objectSayi = sayi;

        System.out.println("objectSayi: " + objectSayi);

        double doubleSayi = 12.5;
        Double objectDoubleSayi = doubleSayi;
        System.out.println("objectDoubleSayi : " + objectDoubleSayi);

        //auto-unboxing
        Integer number = new Integer(10);
        int numberPrimitive = number;
        System.out.println("numberPrimitive : " + numberPrimitive);







    }
}
