package Test.Day_11;

public class Practice_4 {
    public static void main(String[] args) {

        int sayi = 6;

        tekMiCiftMi(sayi);//argument
    }

    public static void tekMiCiftMi(int sayi){//parameter
        if(sayi %2 == 0){
            System.out.println("Bu sayi cift sayidir");
        }else{
            System.out.println("Bu sayi tek sayidir");
        }
    }

}
