package Test.Day_39.Practice_1;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
        List<String> studentList = new ArrayList<>();
        studentList.add("Ahmet");
        studentList.add("Ayse");
        studentList.add("John");


        System.out.println(studentList);

        int numberOfStudent = Basic.numberOfStudent(studentList);
        System.out.println("numberOfStudent = " + numberOfStudent);

         */



        Set<Integer> idlist = new HashSet<>();
        idlist.add(11);
        idlist.add(22);
        idlist.add(33);
        idlist.add(44);
        idlist.add(55);

        System.out.println("idlist = " + idlist);

        int toplam = Basic.sumOfId(idlist);
        System.out.println("toplam = " + toplam);















    }
}
