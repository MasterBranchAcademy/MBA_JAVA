package Test.Day_39.Practice_5;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Map<String,Integer> studentMap = new HashMap<>();
        studentMap.put("Alice",101);
        studentMap.put("Bob",102);
        studentMap.put("Charlie", 103);

        System.out.println("studentMap = " + studentMap);

        List<String> studentNameList = new ArrayList<>(studentMap.keySet());
        System.out.println("studentNameList = " + studentNameList);

        Set<Integer> studentIdList = new HashSet<>(studentMap.values());
        System.out.println("studentIdList = " + studentIdList);







    }
}
