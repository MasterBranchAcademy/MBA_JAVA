package Test.Day_28;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice_1 {
    public static void main(String[] args) {

        //Array
        Integer [] liste_1 = new Integer[10];
        Integer [] liste_2 = {1,2,4,5,6,7,8};
        //System.out.println(Arrays.toString(liste_2));

        //ArrayList
        ArrayList<Integer> liste_3 = new ArrayList<>();
        ArrayList<Integer> liste_4 = new ArrayList<>(Arrays.asList(2,4,5,6,7,9));
        liste_4.add(1000);
        liste_4.remove(2);
        System.out.println(liste_4);













    }
}
