package Test.Day_39.Practice_1;

import java.util.*;

public class Basic {


    public static int numberOfStudent(List<String> studentList){//12,23,34,,56
       return studentList.size();
    }

    public static int sumOfId(Set<Integer> idList){//45,67,89,100
        int sum = 0;
        for (Integer id:idList) {
            sum += id;
        }
        return sum;
    }
}
