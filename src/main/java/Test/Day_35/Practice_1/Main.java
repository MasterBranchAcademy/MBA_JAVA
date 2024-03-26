package Test.Day_35.Practice_1;

public class Main {
    public static void main(String[] args) {

        //Method overloading
        //Bir class icerisinde gerceklesiyor
        //Method isimleri ayni
        //parametreler farkli
        selamlama();
        selamlama("Ahmet");
    }

    public static void selamlama(){
        System.out.println("Hello");
    }

    public static void selamlama(String name){
        System.out.println("Hello " + name);
    }



}
