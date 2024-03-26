package Test.Day_26;

public class SplitPractice {

    public String sonKelime(String str){
        String [] liste = str.split(" ");
        return liste[liste.length-1];
    }

}
