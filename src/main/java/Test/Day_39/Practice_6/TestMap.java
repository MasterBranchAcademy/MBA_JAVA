package Test.Day_39.Practice_6;

import java.util.*;

public class TestMap {


    public static List<String> returnKey(Map<String,Integer> studentMap){
            List<String> studentName = new ArrayList<>(studentMap.keySet());
            return studentName;
    }


    public static Set<Integer> returnValue(Map<String,Integer> studentMap){
        Set<Integer> studentID = new HashSet<>(studentMap.values());
        return studentID;
    }

}
