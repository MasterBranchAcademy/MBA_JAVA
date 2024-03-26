package Test.Day_37.Practice_3;

public interface Test_Interface {

    int test();// public, abstract

    default void test1(){
        System.out.println("Hello from Test_interface");
    }

    static void test2(){
        System.out.println("Hello from static metot -> Test_interface");
    }

}
