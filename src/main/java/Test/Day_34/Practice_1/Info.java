package Test.Day_34.Practice_1;

public class Info {
    String name;
    int number;
    boolean flag;
    char rank;

    public Info(String name, int number, boolean flag, char rank) {
        this.name = name;
        this.number = number;
        this.flag = flag;
        this.rank = rank;
    }

    public void temelBilgiler(){
        System.out.println("Name   : " + name);
        System.out.println("Number : " + number);
        System.out.println("Flag   : " + flag);
        System.out.println("Rank   : " + rank);
    }
}
