package Test.Day_36.Practice_2;

public class Main {
    public static void main(String[] args) {

        Game game = new Game("Superman",45,true);
        String heroName = game.getHeroName();
        System.out.println("heroName: " + heroName);

        game.setHeroAge(2);
        System.out.println("Hero age :" + game.getHeroAge());

        System.out.println(game.toString());

    }
}
