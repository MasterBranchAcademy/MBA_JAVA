package Test.Day_31.Practice_2;

public class Main {
    public static void main(String[] args) {

        Triangle triangle_1 = new Triangle(10,20,40,50);
        System.out.println(triangle_1.cevre());
        System.out.println(triangle_1.alan());

        System.out.println("///////////////////");

        Triangle triangle_2 = new Triangle(1,2,3,4);
        System.out.println(triangle_2.cevre());
        System.out.println(triangle_2.alan());


    }
}
