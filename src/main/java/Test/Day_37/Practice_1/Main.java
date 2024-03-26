package Test.Day_37.Practice_1;

public class Main {
    public static void main(String[] args) {

        //Ulker ulker = new Ulker();
        //ulker.sirketGezisi();


        Godiva godiva = new Godiva();
        System.out.println(godiva.sirketGezisi());

        Ulkerspor ulkerspor = new Ulkerspor();
        System.out.println(ulkerspor.sirketGezisi());


        godiva.calismaSaatleri();
        ulkerspor.calismaSaatleri();


    }
}
