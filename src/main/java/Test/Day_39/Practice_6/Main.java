package Test.Day_39.Practice_6;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> studentMap = new HashMap<>();
        studentMap.put("Ali",101);
        studentMap.put("John",102);
        studentMap.put("Marry",103);
        
        List<String> names = TestMap.returnKey(studentMap);
        System.out.println("names = " + names);

        Set<Integer> ids = TestMap.returnValue(studentMap);
        System.out.println("ids = " + ids);


    }
}
