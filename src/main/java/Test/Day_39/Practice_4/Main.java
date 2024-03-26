package Test.Day_39.Practice_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<String> namesList = new ArrayList<>();
        namesList.add("John");
        namesList.add("Marry");
        namesList.add("Jose");

        System.out.println("namesList = " + namesList);

        Set<Integer> numbersSet = new HashSet<>();
        numbersSet.add(10);
        numbersSet.add(20);
        numbersSet.add(30);

        System.out.println("numbersSet = " + numbersSet);

        Map<List<String>,Set<Integer>> combinedMap = new HashMap<>();
        combinedMap.put(namesList, numbersSet);

        System.out.println("combinedMap = " + combinedMap);


    }
}
