package Test.Day_26;

public class Main {
    public static void main(String[] args) {

        SplitPractice splitPractice = new SplitPractice();

        String str = "Hello world! mba 2024 sdet";
        String sonKelime = splitPractice.sonKelime(str);

        System.out.println("sonKelime : " + sonKelime);


    }
}
