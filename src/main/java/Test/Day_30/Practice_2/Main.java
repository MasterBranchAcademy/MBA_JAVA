package Test.Day_30.Practice_2;

public class Main {
    public static void main(String[] args) {

        Ev ev = new Ev();

        int gelir = 10000;
        int gider = 7000;

        int butceDurumu = ev.butce(gelir, gider);
        System.out.println("butceDurumu: " + butceDurumu);

        int surprizGelir = 2000;
        int surprizGider = 3000;
        int surprizButceDurumu = ev.surprizButce(surprizGelir, surprizGider);
        System.out.println("surprizButceDurumu: " + surprizButceDurumu);

        int sonButce = butceDurumu + surprizButceDurumu;
        System.out.println("sonButce: " + sonButce);

    }
}
