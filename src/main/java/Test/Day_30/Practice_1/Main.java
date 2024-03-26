package Test.Day_30.Practice_1;

public class Main {
    public static void main(String[] args) {

        Ev ev = new Ev();

        ev.father = "John";
        ev.mother = "Marry";
        ev.kid = "Jack";
        ev.numberOfDoors = 4;
        ev.income = 100000.56;

        String fullName = ev.father + "Smith";

        System.out.println(ev.father);
        System.out.println(ev.income);

        System.out.println("fullName : " + fullName);

        ev.father = "Jhonson";

        System.out.println("father: " + ev.father);

        //ev.surname = "Mad";
        System.out.println(ev.surname);

        //ev.gizli ="ertytry";
        ev.balance = 6679;












    }
}
