package Test.Day_15.Pratik_1.Pratik_2;

public class Main {
    public static void main(String[] args) {

       Greeting greeting = new Greeting();

        Planets planets = new Planets();

        SpecialCharacters sc = new SpecialCharacters();

        String message = greeting.greeting_2 + " " + planets.planet_2 + sc.exclamationMark;

        //System.out.println("message : " + message);


        String universalGreeting = greeting.universalGreeting();

        System.out.println("universalGreeting : " + universalGreeting);



    }



}
