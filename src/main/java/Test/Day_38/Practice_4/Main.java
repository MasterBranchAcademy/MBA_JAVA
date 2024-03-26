package Test.Day_38.Practice_4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map<String,Integer> my_map = new HashMap<>();
        my_map.put("Elma",3);
        my_map.put("Armut",5);
        my_map.put("Kiraz",8);
        my_map.put("Muz",2);
        my_map.put("Portakal",5);

        System.out.println(my_map);

        for (int i = 0; i <my_map.size() ; i++) {
            System.out.println(my_map.get("Elma"));
        }






    }
}
