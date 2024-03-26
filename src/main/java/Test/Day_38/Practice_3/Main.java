package Test.Day_38.Practice_3;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> set_1 = new HashSet<>();
        set_1.add("merhaba");
        set_1.add("dunya");
        set_1.add("java");
        set_1.add("programlama");

        System.out.println(set_1);

        set_1.remove("java");

        System.out.println(set_1);




    }
}
