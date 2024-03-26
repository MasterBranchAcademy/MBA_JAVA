package Test.Day_35.Practice_5;

public class Main {
    public static void main(String[] args) {
        //Method overriding
        //Inheritance yapilan class lar arasinda gerceklesir
        //method ismi ayni

        Child child = new Child();
        String classIsmi = child.classInfo();
        System.out.println("classIsmi : " + classIsmi);
    }
}
