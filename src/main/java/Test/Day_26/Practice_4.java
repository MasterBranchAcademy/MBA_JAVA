package Test.Day_26;

import java.util.Arrays;

public class Practice_4 {
    public static void main(String[] args) {

        String sentence = "Sapka icin 223 sonuctan 1-48 arasi";
        String [] list = sentence.split(" ");

        System.out.println(Arrays.toString(list));

        String str = list[list.length - 2];
        System.out.println("str : " + str);



    }
}
